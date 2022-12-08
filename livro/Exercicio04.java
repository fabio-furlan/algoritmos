package br.com.livro;

public class Exercicio04 {

	public static void main(String[] args) {

		String[] tempo = { "1 - Vejo a previsão do tempo", "2 -Se (fizer sol)", "Vou à praia;", "Senão", "Vou estudar;",
				"3 - Almoçar", "4 - Ver televisão", "5 - Dormir" };

		System.out.println("Algoritmo para o final de semana");
		System.out.println("--------------------------------");
		for (String previsao : tempo) {
			System.out.println(previsao);
		}
		System.out.println("--------------------------------");
	}
}
