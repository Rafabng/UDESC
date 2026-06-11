package dao;

import java.util.*;
import java.sql.*;
import java.io.*;
import dao.cliente.ClienteDAO;
import dao.cliente.ClienteDAOOracle;

public class OracleDAOFactory extends AbstractDAOFactory {

	private String driverClass;
	private String jdbcURL; 	
	private String usuario; 
	private String senha; 	

	/**
	 * Construtor sem argumentos.
	 */
	public OracleDAOFactory() {   
		setDriverClass("oracle.jdbc.driver.OracleDriver");
		setJdbcURL("jdbc:oracle:thin:@localhost:1521:XE");
		setUsuario("cliente");
		setSenha("cliente");
	}
	
	public String getDriverClass(){
		return driverClass;
	}
	
	public void setDriverClass(String driverClass){
		this.driverClass = driverClass;
	}

	public String getJdbcURL()	{
		return jdbcURL;
	}
	
	public void setJdbcURL(String jdbcURL){
		this.jdbcURL = jdbcURL;
	}
	
	public String getUsuario()	{
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Retorna uma conex�o aberta para as subclasses da f�brica para oracle.
	 * @return Connection Um objeto com a conex�o aberta
	 * @exception SQLException
	 */
	protected Connection getConnection() throws SQLException {
		Connection con = null;
		try {	
			Class.forName(getDriverClass());	
			con = DriverManager.getConnection(getJdbcURL(), getUsuario(), getSenha());			
	    } 
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}	
		catch (SQLException e) {
			throw e;  
		} 
		return con;
	}	
	
	/**
	 * Opera��o para prepara a string que ser� enviada ao banco de dados 
	 * Se ela possui uma ' ser� duplicada para anular o efeito de sql injetado
	 * 
	 * @return String texto com ' duplicado
	 * @param valor string a ser preparada para envio ao banco de dados
	 */
	protected String preparaSQL(String valor) {
		if (valor != null) { 
			return valor.replaceAll("\'","''");
		} else { 
			return "";
		}
	}
	
	
		/**
	 * Concatena String baseado nos valores Strings de uma Collection
	 * @return String Com os literais conctatenados.
	 * 
	 * @param separator
	 * @param collection
	 */
	public String implode( String separator, Collection collection) {
		StringBuffer textBufferReturn = new StringBuffer();
		Iterator it = collection.iterator();
		while( it.hasNext() ) {
			String text = (String) it.next();
			textBufferReturn.append(text);
			if(it.hasNext()) textBufferReturn.append(separator);
		}
		return textBufferReturn.toString();
	}
		
	/**
	 * Retorna uma Cliente DAO
	 * @return ClienteDAO Um DAO para cliente
	 */
	public ClienteDAO getCliente(){
		return new ClienteDAOOracle();
	}
}

