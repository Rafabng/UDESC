package controle;

import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import visao.FrmCliente;
import modelo.Cliente;
import util.Utilidades;

import dao.cliente.ClienteDAO;
import dao.AbstractDAOFactory;
import java.util.List;

import util.Utilidades;

public class CtrlCliente {

	private FrmCliente frmCliente;
	private AbstractDAOFactory factory =  AbstractDAOFactory.getFactory(AbstractDAOFactory.FABRICA);
	private ClienteDAO clienteDAO =  factory.getCliente();
	private Cliente cliente = null;
	Utilidades utilidades = new Utilidades();
	
	public CtrlCliente() {
		// Instacia a janela
		setFrmCliente(new FrmCliente());
				

		// Associa os eventos aos componentes
		getFrmCliente().jBIncluir.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jBIncluir_actionPerformed(e);
					}
				});
				
		getFrmCliente().jBAlterar
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jBAlterar_actionPerformed(e);
					}
				});
				
		getFrmCliente().jBConsultar
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jBConsultar_actionPerformed(e);
					}
				});				
						
		getFrmCliente().jBExcluir
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jBExcluir_actionPerformed(e);
					}
				});			
	
		getFrmCliente().jBLimpar
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jBLimpar_actionPerformed(e);
					}
				});

	
		getFrmCliente().jBFechar
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jBFechar_actionPerformed(e);
					}
				});
		
		getFrmCliente().JTRenda.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (getFrmCliente().JTRenda.getText().length() > 0) {
                	getFrmCliente().JTExtenso.setText(utilidades.geraExtenso(Double.valueOf(getFrmCliente().JTRenda.getText())));
                }
            }
        });
	}
	
	public void executar() {
		getFrmCliente().setVisible(true);
	}
	
	public Cliente getCliente() {
		Cliente cliente = new Cliente();
		cliente.setClienteId(getFrmCliente().jTClienteId.getText());
		cliente.setNome(getFrmCliente().jTNome.getText());
		cliente.setCpf(getFrmCliente().jTCpf.getText());
		cliente.setRenda(Double.valueOf(getFrmCliente().JTRenda.getText()));
		cliente.setExtenso(getFrmCliente().JTExtenso.getText());
		return cliente;
	}
	
	public void jBIncluir_actionPerformed(ActionEvent e) {
		cliente = getCliente();
    	Utilidades valida = new Utilidades();
		
		if (valida.validaCPF(cliente.getCpf())) {
				
			if (clienteDAO.inserir(cliente)){
				getFrmCliente().mostrarMensagem("Inclusao realizada com sucesso!");
			} else {
				getFrmCliente().mostrarMensagem("Inclusao nao realizada!");
			}
		} else {
			getFrmCliente().mostrarMensagem("CPF Invalido!");
		}
	}
	
	public void jBAlterar_actionPerformed(ActionEvent e) {
		cliente = getCliente();
		Utilidades valida = new Utilidades();
		if (valida.validaCPF(cliente.getCpf())) {
			if (clienteDAO.alterar(cliente) !=0){
				getFrmCliente().mostrarMensagem("Alteracao realizada com sucesso!");
			} else {
				getFrmCliente().mostrarMensagem("Alteracao nao realizada!");
			}	
		} else {
			getFrmCliente().mostrarMensagem("CPF Invalido!");
		}
	}
	
	private List aplicarFiltro(Cliente cliente){
		//ClienteDAO clienteDAO = factory.getCliente();		
		return clienteDAO.aplicarFiltro(cliente);
	}
	
	private List getLista() {
		//ClienteDAO cliente = factory.getCliente();		
		return clienteDAO.getLista();
	}	
	
	public void jBConsultar_actionPerformed(ActionEvent e) {
		
		List lista = aplicarFiltro(cliente);
		if (!lista.isEmpty()) {
			Cliente oCliente = (Cliente) lista.iterator().next();
			cliente.setNome(oCliente.getNome());
			cliente.setCpf(oCliente.getCpf());
			getFrmCliente().jTNome.setText(cliente.getNome());
			getFrmCliente().jTCpf.setText(cliente.getCpf());
			getFrmCliente().JTRenda.setText(String.valueOf(cliente.getRenda()));
			getFrmCliente().JTExtenso.setText(String.valueOf(cliente.getExtenso()));
			getFrmCliente().mostrarMensagem("Cliente encontrado!");					
		} 
		else {
			getFrmCliente().mostrarMensagem("Cliente nao encontrado!");
		}
	}
	
	public void jBExcluir_actionPerformed(ActionEvent e) {
		cliente = getCliente();
		//ClienteDAO clienteDAO = factory.getCliente();		
		if (clienteDAO.excluir(cliente) !=0){
			getFrmCliente().mostrarMensagem("Exclusao realizada com sucesso!");
		} else {
			getFrmCliente().mostrarMensagem("Exclusao nao realizada!");
		}
	
	}
	
	public void jBLimpar_actionPerformed(ActionEvent e) {
		getFrmCliente().jTClienteId.setText("");
		getFrmCliente().jTNome.setText("");
		getFrmCliente().jTCpf.setText("");
		getFrmCliente().JTRenda.setText("");
		getFrmCliente().JTExtenso.setText("");
	}
	
	void jBFechar_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public FrmCliente getFrmCliente(){
		return frmCliente;
	}

	public void setFrmCliente(FrmCliente frmCliente){
		this.frmCliente = frmCliente;
	}
}

