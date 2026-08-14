package modelo;

public class Cliente {
	private String clienteId;
	private String nome;
	private String cpf;
	private double renda;
	private String extenso;
	
	
	public Cliente(){
		this("","","",0,"");	
	}


	public Cliente(String clienteId, String nome, String cpf, double renda, String extenso){
		setClienteId(clienteId);
		setNome(nome);		
		setCpf(cpf);
		setRenda(renda);
		setExtenso(extenso);
	}
	 
	public String getClienteId(){
		return clienteId;
	}
	
	public void setClienteId(String clienteId){
		this.clienteId = clienteId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getExtenso(){
		return extenso;
	}
	
	public void setExtenso(String extenso){
		this.extenso = extenso;
	}
	
	public double getRenda(){
		return renda;
	}
	
	public void setRenda(double renda){
		this.renda = renda;
	}
	
	public String paraString(){
		return ("clienteId:" + getClienteId() + " - Nome :" + getNome());
	}
		
}