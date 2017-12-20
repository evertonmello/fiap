package fiap.scj;

import java.util.ArrayList;

public class Cliente {

	private String id;
	private String nome;
	private String cpf;	
	private String endereco;
	private int fone;
	private Serasa conta;
	private ArrayList<Double> valoresPConsulta = new ArrayList<>();
	


	public Cliente() {}
	
	public Cliente(String id, String nome, String cpf, String endereco, int fone, Serasa conta) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.fone = fone;
		this.conta = conta;
	}
	
	public ArrayList<Double> getValoresPConsulta() {
		return valoresPConsulta;
	}

	public void setValoresPConsulta(ArrayList<Double> valoresPConsulta) {
		this.valoresPConsulta = valoresPConsulta;
	}
	
	public void addValorConsulta(Double valor) {
		this.valoresPConsulta.add(valor);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String i) {
		this.cpf = i;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getFone() {
		return fone;
	}
	public void setFone(int fone) {
		this.fone = fone;
	}
	public Serasa getConta() {
		return conta;
	}
	public void setConta(Serasa conta) {
		this.conta = conta;
	}
	
	
	
}
