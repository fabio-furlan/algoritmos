package br.com.livro;

public class Exercicio02 {

	public static void main(String[] args) {

		String a = "1 - Pegar o chiclete.";
		String b = "2 - Retirar o papel.";
		String c = "3 - Mastigar.";
		String d = "4 - jogar o papel no lixo.";
		
		System.out.println("Algoritmo para mascar chiclete");	
		System.out.println("-------------------------------");

		if (a != b) {
			System.out.println(a);
		}
		if (b != c) {
			System.out.println(b);
		}
		if (c != d) {
			System.out.println(c);
		}
		if (d != a) {
			System.out.println(d);
		}
		System.out.println("-------------------------------");
	}
}
