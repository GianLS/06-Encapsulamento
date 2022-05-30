package br.com.glandata.main;

import br.com.glandata.model.Animal;

public class ExecutaAnimal {

	public static void main(String[] args) {
		Animal ave = new Animal();
		ave.setTipo("Ave");
		ave.setTipoAlimentacao("Carnívora");
		ave.setMeioLocomocao("Voar");
		ave.setIdadeMaxima(70);
		ave.setNome("Falcão Real");

		Animal foca = new Animal();
		foca.setTipo("Mamífero");
		foca.setTipoAlimentacao("Carnívora");
		foca.setMeioLocomocao("Nadar/Arrastar");
		foca.setIdadeMaxima(60);
		foca.setNome("Arnaldo");

		System.out.println(ave);
		System.out.println(foca);
		
		Animal foca2 = new Animal();
		foca2.setTipo("Mamífero");
		foca2.setTipoAlimentacao("Carnívora");
		foca2.setMeioLocomocao("Nadar/Arrastar");
		foca2.setIdadeMaxima(60);
		foca2.setNome("Arnoldo");
		
		System.out.println(foca2);
		
		System.out.println(foca.equals(foca2) ? "Igual" : "Diferente");

	}

}
