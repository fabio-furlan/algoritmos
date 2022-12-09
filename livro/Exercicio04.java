package br.com.algoritmos;

public class Exercicio04 {

	public static void main(String[] args) {

		boolean TempoBom = true;
		boolean TempoRuim = false;

		System.out.println("Algoritmo para fim de semana");
		System.out.println("------------------------------");

		System.out.println("1 - Vejo a previsão do tempo.");

		if (TempoBom) {
			System.out.printf("%s \n %s \n %s \n", "2 - Se fizer sol.", "vou à praia;", "senão");

		} else {
			System.out.println("Estudar");
		}

		if (TempoRuim == TempoBom) {
			System.out.println("Praia");
		} else {
			System.out.printf("%s \n %s \n %s \n %s \n", "Vou estudar", "3 - Almoçar", "4 - ver televisão",
					"5 - Dormir");
		}
		System.out.print("------------------------------");
	}

}
