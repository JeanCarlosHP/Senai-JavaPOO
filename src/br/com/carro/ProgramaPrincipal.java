package br.com.carro;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setMarca("Fiat");
		carro1.setModelo("Uno");
		carro1.setAno(2010);
		carro1.setQtdPortas(4);
		
		carro2.setMarca("Fiat");
		carro2.setModelo("Siena");
		carro2.setAno(2015);
		carro2.setQtdPortas(4);
		
		carro3.setMarca("volkswagen");
		carro3.setModelo("Gol");
		carro3.setAno(2017);
		carro3.setQtdPortas(3);
		
		carro4.setMarca("Fiat");
		carro4.setModelo("Toro");
		carro4.setAno(2020);
		carro4.setQtdPortas(2);
		
		carro5.setMarca("Toyota");
		carro5.setModelo("Corolla");
		carro5.setAno(2019);
		carro5.setQtdPortas(4);
		
		System.out.println("--- Carro 1 ---");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdPortas());
		
		System.out.println("\n--- Carro 2 ---");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdPortas());
		
		System.out.println("\n--- Carro 3 ---");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdPortas());
		
		System.out.println("\n--- Carro 4 ---");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQtdPortas());
		
		System.out.println("\n--- Carro 5 ---");
		System.out.println(carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println(carro5.getAno());
		System.out.println(carro5.getQtdPortas());

	}

}
