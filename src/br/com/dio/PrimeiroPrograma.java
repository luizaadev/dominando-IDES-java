package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
                System.out.print(livro);
	}

}

	class Livro {
		private String nome;
		private String npag;
	}
