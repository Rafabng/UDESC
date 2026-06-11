package dao.cliente;

import java.util.List;

public interface ClienteDAO {
		
	public boolean inserir(Object obj);

	public int alterar(Object obj);

	public int excluir(Object obj);

	public List aplicarFiltro(Object obj);	
	
	public List getLista();

}
