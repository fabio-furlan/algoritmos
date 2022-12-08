//Exercicio 01

package br.com.livro;

import java.util.Scanner;

public class Telefone {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String op1 = "6 - Retirar o telefone do gancho." ;
		String op2 = "2 - Esperar o sinal.";
		String op3 = "5 - Colocar o cartão.";
		String op4 = "4 - Discar o número.";
		String op5 = "3 - Falar no telefone.";
		String op6 = "1 - Colocar o telefone no gancho.";
		
		String n1 ="1";
		String n2 ="2";
		String n3 ="3";
		String n4 ="4";
		String n5 ="5";
		String n6 ="6";
		
		System.out.println();
		System.out.println("*** Como simular uma chamada telefonica em um telefone público ***");
		
		System.out.println();
		System.out.println(" Escolha o número que representa a lógica !!! ");
		System.out.println();
		
		System.out.println("=================================");
		
		
		System.out.println(op6 + "\n" + op2 + " \n" + op5 
		 + "\n" + op4 + "\n" + op3 + "\n" + op1);
		
		System.out.println("=================================");
		
		System.out.println();
		System.out.println("Digite a opção: ");
		
		
		String opcao1 = scan.next();
		
		if (opcao1.equals(n6)) {
			System.out.println();
			
			System.out.println("Acertou! " );
			System.out.println();
			System.out.println(" Retirar o telefone do gancho.");
			
		}else  {
			
			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE ===== ");
		}
		System.out.println();
		System.out.println("Digite a opção: ");
		
String opcao2 = scan.next();
		
		if (opcao2.equals(n2)) {
			System.out.println();
			
			System.out.println("Acertou!");
			System.out.println();
			System.out.println("1° - Retirar o telefone do gancho.");
			System.out.println("2° - Esperar o sinal.");
			
		}else  {
			
			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE ===== ");
		}
		
		System.out.println();
		System.out.println("Digite a opção: ");
		
String opcao3 = scan.next();
		
		if (opcao3.equals(n5)) {
			System.out.println();
			
			System.out.println("Acertou!");
			System.out.println();
			System.out.println("1° - Retirar o telefone do gancho.");
			System.out.println("2° - Esperar o sinal.");
			System.out.println("3° - Colocar o cartão.");
			
		}else  {
			
			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE ===== ");
		}
		
		System.out.println();
		System.out.println("Digite a opção: ");
		
String opcao4 = scan.next();
		
		if (opcao4.equals(n4)) {
			System.out.println();
			
			System.out.println("Acertou!");
			System.out.println();
			System.out.println("1° - Retirar o telefone do gancho.");
			System.out.println("2° - Esperar o sinal.");
			System.out.println("3° - Colocar o cartão.");
			System.out.println("4° - Discar o número.");
			
		}else  {
			
			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE ===== ");
		}
		System.out.println();
		System.out.println("Digite a opção: ");
		
String opcao5 = scan.next();
		
		if (opcao5.equals(n3)) {
			System.out.println();
			
			System.out.println("Acertou!");
			System.out.println();
			System.out.println("1° - Retirar o telefone do gancho.");
			System.out.println("2° - Esperar o sinal.");
			System.out.println("3° - Colocar o cartão.");
			System.out.println("4° - Discar o número.");
			System.out.println("5° - Falar no telefone.");
			
		}else  {
			
			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE ===== ");
		}
		System.out.println();
		System.out.println("Digite a opção: ");
		
String opcao6 = scan.next();
		
		if (opcao6.equals(n1)) {
			System.out.println();
			
			System.out.println("Acertou!");
			System.out.println();
			System.out.println("1° - Retirar o telefone do gancho.");
			System.out.println("2° - Esperar o sinal.");
			System.out.println("3° - Colocar o cartão.");
			System.out.println("4° - Discar o número.");
			System.out.println("5° - Falar no telefone.");
			System.out.println("6° - Colocar o telefone no gancho.");
			
		}else  {
			
			System.out.println();
			System.out.println("Errou!");
			System.out.println();
			System.out.println("===== TENTE NOVAMENTE ===== ");
		}
		System.out.println();
		System.out.println(" ===== FIM =====");
		
			scan.close();
		}
		
	}

