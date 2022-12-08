package br.com.livro;

import java.util.Scanner;

public class ReceitaOvo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String op1 = "6 - Pegar a frigideira, ovo, oleo e sal.";
		String op2 = "7 - Colocar oleo na frigideira.";
		String op3 = "5 - Acender o fogo.";
		String op4 = "4 - Colocar a frigideira no fogo.";
		String op5 = "3 - Esperar o oleo esquentar.";
		String op6 = "1 - Colocar o ovo na frigideira.";
		String op7 = "2 - Retirar quando pronto.";

		String n1 = "1";
		String n2 = "2";
		String n3 = "3";
		String n4 = "4";
		String n5 = "5";
		String n6 = "6";
		String n7 = "7";

		System.out.println();
		System.out.println("        *** Como fritar um ovo ***");

		System.out.println();
		System.out.println("Escolha o número que representa a lógica ! ");
		System.out.println();

		System.out.println("=========================================");

		System.out.println(op6 + "\n" + op7 + " \n" + op5 + "\n" + op4 + "\n" + op3 + "\n" + op1 + "\n" + op2);

		System.out.println("=========================================");

		System.out.println();
		System.out.println("Digite uma opção: ");

		String opcao1 = scan.next();

		if (opcao1.equals(n6)) {
			System.out.println();

			System.out.println("Acertou! ");
			System.out.println();
			System.out.println("1° - Pegar a frigideira, ovo, oleo e sal.");
			System.out.println();
			System.out.println("=========================================");

		} else {

			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE =====");
		}
		System.out.println();
		System.out.println("Digite uma opção: ");

		String opcao2 = scan.next();

		if (opcao2.equals(n7)) {
			System.out.println();

			System.out.println("Acertou! ");
			System.out.println();
			System.out.println("1° - Pegar a frigideira, ovo, oleo e sal.");
			System.out.println("2° - Colocar oleo na frigideira.");
			System.out.println();
			System.out.println("=========================================");

		} else {

			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE =====");
		}
		System.out.println();
		System.out.println("Digite uma opção: ");

		String opcao3 = scan.next();

		if (opcao3.equals(n5)) {
			System.out.println();

			System.out.println("Acertou! ");
			System.out.println();
			System.out.println("1° - Pegar a frigideira, ovo, oleo e sal.");
			System.out.println("2° - Colocar oleo na frigideira.");
			System.out.println("3° - Acender o fogo.");

		} else {

			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE =====");
		}
		System.out.println();
		System.out.println("Digite uma opção: ");

		String opcao4 = scan.next();

		if (opcao4.equals(n4)) {
			System.out.println();

			System.out.println("Acertou! ");
			System.out.println();
			System.out.println("1° - Pegar a frigideira, ovo, oleo e sal.");
			System.out.println("2° - Colocar oleo na frigideira.");
			System.out.println("3° - Acender o fogo.");
			System.out.println("4° - Colocar a frigideira no fogo.");

		} else {

			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE =====");
		}
		System.out.println();
		System.out.println("Digite uma opção: ");

		String opcao5 = scan.next();

		if (opcao5.equals(n3)) {
			System.out.println();

			System.out.println("Acertou! ");
			System.out.println();
			System.out.println("1° - Pegar a frigideira, ovo, oleo e sal.");
			System.out.println("2° - Colocar oleo na frigideira.");
			System.out.println("3° - Acender o fogo.");
			System.out.println("4° - Colocar a frigideira no fogo.");
			System.out.println("5° - Esperar o oleo esquentar.");

		} else {

			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE =====");
		}
		System.out.println();
		System.out.println("Digite uma opção: ");

		String opcao6 = scan.next();

		if (opcao6.equals(n1)) {
			System.out.println();

			System.out.println("Acertou! ");
			System.out.println();
			System.out.println("1° - Pegar a frigideira, ovo, oleo e sal.");
			System.out.println("2° - Colocar oleo na frigideira.");
			System.out.println("3° - Acender o fogo.");
			System.out.println("4° - Colocar a frigideira no fogo.");
			System.out.println("5° - Esperar o oleo esquentar.");
			System.out.println("6° - Colocar o ovo na frigideira.");

		} else {

			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE =====");
		}
	}

}
