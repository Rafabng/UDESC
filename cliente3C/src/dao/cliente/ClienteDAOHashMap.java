package dao.cliente;

import java.util.*;
import java.sql.*;
import java.io.*;
import dao.HashMapDAOFactory;
import modelo.Cliente;

public class ClienteDAOHashMap extends HashMapDAOFactory implements ClienteDAO {

	private static Map<String,Cliente> mapa;
	
	/**
	 * Construtor sem argumentos.
	 */
	public ClienteDAOHashMap(){
		//Se o mapa estiver nulo instancia para armazenar os clientes
		if (mapa == null) {
			mapa = new HashMap<String,Cliente>();		
		}		
	}
	
	public boolean inserir(Object obj) {
		try{
			Cliente cliente = (Cliente) obj;						
			boolean tem = mapa.containsKey(cliente.getClienteId());
			if (tem==false) {
				mapa.put(cliente.getClienteId(), cliente);
				return true;
			} else {
				return false;
			}
		}
		catch (NullPointerException e)
		{
			return false;
		}
		
	}

	public int alterar(Object obj) {
		if (obj != null) {
			Cliente cliente = (Cliente) obj;			
			boolean tem = mapa.containsKey(cliente.getClienteId());
			if (tem==true) {
				Cliente c = (Cliente)mapa.get(cliente.getClienteId());	
				c.setNome(cliente.getNome());
				c.setCpf(cliente.getCpf());
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}

	public int excluir(Object obj) {
		if (obj == null) 
			throw new NullPointerException();
				
		if (obj != null) {
			Cliente cliente = (Cliente) obj;			
			boolean tem = mapa.containsKey(cliente.getClienteId());
			if (tem==true) {				
				mapa.remove(cliente.getClienteId());				
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}

	public List getLista() {
		LinkedList lista = new LinkedList();
		Iterator it = mapa.values().iterator();
		while(it.hasNext()) { //Avança enquanto tiver objetos
		   Cliente c = (Cliente)it.next();
		   lista.add(c);
		}
		return lista;
	}
		
	public List aplicarFiltro(Object obj) {
		if (obj != null) {
			Cliente cliente = (Cliente) obj;
			LinkedList lista = new LinkedList();
			Iterator it = mapa.values().iterator();
			
			//Filtro para clienteId
			if (cliente.getClienteId() != null) {
				while(it.hasNext()) { //Avança enquanto tiver objetos
					Cliente c = (Cliente)it.next();
					if (c.getClienteId().equalsIgnoreCase(cliente.getClienteId())) {						
						lista.add(c);
					}
				}
			} else {
				//Filtro para nome
				if (cliente.getNome() != null) {
					while(it.hasNext()) { //Avança enquanto tiver objetos
						Cliente c = (Cliente)it.next();
						if (c.getNome().equalsIgnoreCase(cliente.getNome())) {
							lista.add(c);
						}
					}
				} else {
					//Filtro para CPF
					if (cliente.getCpf() != null) {
						while(it.hasNext()) { //Avança enquanto tiver objetos
							Cliente c = (Cliente)it.next();
							if (c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
								lista.add(c);
							}
						}
					}
				}
			}
			
			return lista;
		} else {
			return null;
		}
	}			
}
