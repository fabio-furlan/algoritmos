package br.com.algoritmos;

public class Exercicio03 {

	public static void main(String[] args) {

		boolean lampada = true;

		System.out.println("   Algoritmo para trocar a lâmpada");
		System.out.println("----------------------------------------");

		System.out.println("1 - Se (lâmpada estiver fora de alcance).");

		if (lampada) {
			System.out.println("  pegar escada.");
		} else {
			System.out.println("  Não pegar escada");
		}
		System.out.println("2 - Pegar lâmpada.");
		System.out.println("3 - Se lâmpada estiver quente");

		if (lampada) {
			System.out.println("  pegar pano");
		} else {
			System.out.println("  não precisa do pano.");
		}
		System.out.println("4 - Tirar lâmpada.");
		System.out.println("5 - Colocar lâmpada boa.");
		System.out.println("----------------------------------------");
	}
}
