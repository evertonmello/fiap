package fiap.scj;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Serasa conta = new Serasa();
		Cliente c1 = new Cliente();
		
		c1.setId("1");
		c1.setConta(conta);
		c1.setNome("Joao Da silva");
		c1.setCpf("52652428288");
		c1.setEndereco("rua das ostras");
		c1.setFone(1198372626);		
		
		c1.setConta(conta);
		
		c1.addValorConsulta((double) 1000);
		c1.addValorConsulta((double) 100000);
		c1.addValorConsulta((double) 6770000);
		
		System.out.println("Informações do Cliente: ");
		System.out.println(c1.getNome() + " ");
		
		
		System.out.println("\n");
		System.out.println("consulta de valores:");
		for (Double valor : c1.getValoresPConsulta()) {
			
			if(valor <= Categoria.Basico.getMaximo() && valor > Categoria.Basico.getMinimo()) {
				System.out.println("basico");
			}
			if(valor <= Categoria.Platinum.getMaximo() && valor > Categoria.Platinum.getMinimo()) {
				System.out.println("platinum");
			}
			if(valor <= Categoria.Golden.getMaximo() && valor > Categoria.Golden.getMinimo()) {
				System.out.println("golden");
			}
			if(valor >= Categoria.Black.getMinimo()) {
				System.out.println("black");
			}
		}
		
	
		

	}

}
