package br.com.livro;

public class Exercicio11a {

public static void main(String[] args) {
		
		String[] travessia = {"1 - Atravessar dois Canibais.", " descer um Canibal.",
		"2 - Voltar um Canibal.","3 - Atravessar dois Canibais.", " descer um Canibal.", 
		"4 - Voltar um Canibal.", " descer um Canibal.", "5 - Atravessar dois Missionários.", " descer um Missionário.",
		"6 - Voltar um Missionário e um Canibal."," descer um Canibal.", "7 - Atravessar dois Missionários.", " descer 2 Missionários.",
		"8 - Voltar um Canibal.", "9 - Atravessar dois Canibais.", " descer um Canibal.", "10 - Voltar um Canibal.", 
		"11 - Atravessar 2 Canibais.", " descer 2 canibais."};
		
		System.out.println("Algoritmo para atravessar Missionário e Padre");	
		System.out.println("---------------------------------------------");
		for (int i = 0; i < travessia.length; i++) {
			System.out.println(travessia[i]);
		}
		System.out.println("--------------------------------------------");
		
	}
}
