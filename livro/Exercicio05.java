package br.com.livro;

public class Exercicio05 {

	public static void main(String[] args) {

		String[] bolo = { "1 - pegar os ingredientes;", "2 - se (roupa branca)", "colocar avental;",
				"3 - se (tiver batedeira)", "bater os ingredientes na batedeira;", "senão",
				"bater os ingredientes à mão;", "4 - colocar a massa na forma;", "5 - colocar a forma no forno;",
				"6 - aguardar o tempo necessário;", "7 - retiraro bolo;" };

		System.out.println("Algoritmo para fazer um bolo simples");
		System.out.println("------------------------------------");

		for (int i = 0; i < bolo.length; i++) {
			System.out.println(bolo[i]);
		}
		System.out.println("------------------------------------");
	}
}
