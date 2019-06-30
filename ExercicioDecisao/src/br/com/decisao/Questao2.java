package br.com.decisao;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resposta;
		
		resposta = Teclado.lerTexto("Qual a capital do Brasil? ");
		
		if (resposta.equalsIgnoreCase("Brasilia")) {
			System.out.println("Voce acertou!");
		}
		
		else {
			System.out.println("Voce errou!");
		}

	}

}
