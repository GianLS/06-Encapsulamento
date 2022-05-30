package br.com.glandata.main;

import br.com.glandata.model.Animal;

public class ExecutaAnimal {

	public static void main(String[] args) {
		Animal ave = new Animal();
		ave.setTipo("Ave");
		ave.setTipoAlimentacao("Carn�vora");
		ave.setMeioLocomocao("Voar");
		ave.setIdadeMaxima(70);
		ave.setNome("Falc�o Real");

		Animal foca = new Animal();
		foca.setTipo("Mam�fero");
		foca.setTipoAlimentacao("Carn�vora");
		foca.setMeioLocomocao("Nadar/Arrastar");
		foca.setIdadeMaxima(60);
		foca.setNome("Arnaldo");

		System.out.println(ave);
		System.out.println(foca);
		
		Animal foca2 = new Animal();
		foca2.setTipo("Mam�fero");
		foca2.setTipoAlimentacao("Carn�vora");
		foca2.setMeioLocomocao("Nadar/Arrastar");
		foca2.setIdadeMaxima(60);
		foca2.setNome("Arnoldo");
		
		System.out.println(foca2);
		
		System.out.println(foca.equals(foca2) ? "Igual" : "Diferente");

	}

}
