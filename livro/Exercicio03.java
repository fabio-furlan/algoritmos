package br.com.livro;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	String SN  ;
	
	System.out.println("Algoritmo para trocar a lâmpada.");
	System.out.println("--------------------------------");
	
	System.out.println("Digite S para SIM e N para NÃO.");
	System.out.println();
	System.out.println("A lâmpada está fora de alcance?");
	
	
	SN = scan.nextLine();
	
	if(SN.equals("s")) {
		System.out.println("Pegar escada.");
		System.out.println("Pegar a lâmpada");
		System.out.println("A lâmpada está quente?");
		System.out.println();
	}else if(SN.equals("n")) {
		System.out.println("Pegar a lâmpada.");
		System.out.println("A lâmpada está quente?");
		System.out.println();
	}else {
		System.out.println("Opção inválida");
		
	} 
	
	SN = scan.nextLine();
	if(SN.equals("s")) {
		System.out.println("Pegar Pano");
		
	}else {
		System.out.println(" Tirar lâmpada queimada.");
	}
	
	System.out.println("Colocar lâmpada boa!");
	
	scan.close();
	
 }

}








