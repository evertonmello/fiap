package fiap.scj;

public enum Categoria {

	Basico("basico",0, 50000), Platinum("platinum", 50001, 250000), Golden("golden", 250001, 1000000), Black("golden", 1000000, 1000000);

	private String desc;
	private double minimo;
	private double maximo;

	Categoria(String desc,  double minimo, double maximo) {
		this.maximo = maximo;
		this.minimo = minimo;
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public double getMaximo() {
		return this.maximo;
	}
	
	public double getMinimo() {
		return this.minimo;
	}

}