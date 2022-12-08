package br.com.livro;

public class Exercicio09 {

	public static void main(String[] args) {

		String[] jogo = { "Enquanto ((existir um quadrado livre ) e (ninguém perdeu(ganhou) o jogo))",
				"Espere a jogada do adversário, continue depois", "Se (existir um quadrado livre)", "Se (centro livre)",
				"Jogue no centro", "Senão", "Se (adversário tem 2 quadrados em linha com o terceiro desocupado)",
				"Jogue neste quadrado desocupado", "Senão", "Se (há algum canto livre)", "Jogue neste canto" };

		System.out.println("            Algoritmo para jogar jogo da velha");
		System.out.println("--------------------------------------------------------------------------");

		for (int i = 0; i < jogo.length; i++) {
			System.out.println(jogo[i]);
		}
		System.out.println("--------------------------------------------------------------------------");
	}
}
