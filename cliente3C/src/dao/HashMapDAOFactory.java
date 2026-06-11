package dao;

import java.util.*;
import java.sql.*;
import java.io.*;
import dao.cliente.ClienteDAO;
import dao.cliente.ClienteDAOHashMap;

public class HashMapDAOFactory extends AbstractDAOFactory {
	
	public HashMapDAOFactory() {   
	}
	
	/**
	 * Retorna uma Cliente DAO
	 * @return ClienteDAO Um DAO para cliente
	 */
	public ClienteDAO getCliente(){
		return new ClienteDAOHashMap();
	}
}

