package fiap.scj;

public class Serasa {
	
	private String ativo;	
	private String inativo;	
	private String devedor;	
	private Cliente cliente;
	private String limite;
	
	public Serasa() {}
	
	public Serasa(String ativo, String inativo, String devedor, Cliente cliente, String limite) {

		this.ativo = ativo;
		this.inativo = inativo;
		this.devedor = devedor;
		this.cliente = cliente;
		this.limite = limite;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}

	public String getDevedor() {
		return devedor;
	}

	public void setDevedor(String devedor) {
		this.devedor = devedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getLimite() {
		return limite;
	}

	public void setLimite(String limite) {
		this.limite = limite;
	}
	
	
}
