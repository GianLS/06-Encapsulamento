package br.com.glandata.main;

import br.com.glandata.model.Animal;

public class TestaConstrutor {

	public static void main(String[] args) {
		Animal animal = new Animal("Cacatua", "Mamífero", "Voar", "Carne", 65);
		
		System.out.println(animal);
	}

}
