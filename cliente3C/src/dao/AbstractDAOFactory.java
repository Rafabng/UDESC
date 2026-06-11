package dao;

import dao.cliente.ClienteDAO;

public abstract class AbstractDAOFactory {	

	//Tipos de Fonte de Dados suportados pela Factory
	public static final int ORACLE = 1;
 	public static final int HASHMAP = 2;
 	
 	public static final int FABRICA = 2;

	//Retorna o DAO instanciado
	public abstract ClienteDAO getCliente();

	//Retorna a Factory do tipo especificado	
	public static AbstractDAOFactory getFactory(int whichFactory) {
  	   switch (whichFactory) {
		case ORACLE : 
		   return new OracleDAOFactory();
		case HASHMAP : 
		   return new HashMapDAOFactory();
		default : 
            return null;
      }
  	}
}
