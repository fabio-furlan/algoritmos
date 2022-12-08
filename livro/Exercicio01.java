package br.com.livro;

public class Exercicio01 {

	public static void main(String[] args) {

		String[] receita = { "1 - Pegar frigideira, ovo, óleo e sal.", "2 - Colocar óleo na frigideira.",
				"3 - Acender o fogo.", "4 - Colocar a frigideira no fogo.", "5 - Esperar o óleo esquentar.",
				"6 - Colocar o ovo na frigideira.", "7 - Retirar quando pronto." };
		
		System.out.println("    Algoritmo para fritar ovo");	
		System.out.println("--------------------------------------");
		for (int i = 0; i < receita.length; i++) {
			System.out.println(receita[i]);
		}
		System.out.println("--------------------------------------");
	}
}