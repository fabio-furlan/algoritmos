package br.com.livro;

public class Exercicio08 {

	public static void main(String[] args) {
		
		String [] dados = {"1 - escolher a palavra;",
		"2 - montar o diagrama do jogo;",
		"3 - enquanto ((houver lacunas vazias) e (corpo incompleto))faça",
		"se (acertar uma letra)",
		"escrever na lacuna correspondente;",
		"senão",
		"desenhar uma parte do corpo na forca;"}; 
		System.out.println(" Algoritmo para jogar o jogo da forca");
		System.out.println("----------------------------------------------------------------");
		for(int i = 0; i <dados.length;i++) {
			System.out.println(dados[i]);
		}
		System.out.println("----------------------------------------------------------------");
		
		

	}

}
