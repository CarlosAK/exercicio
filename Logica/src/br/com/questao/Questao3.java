package br.com.questao;

import br.com.util.Teclado;

public class Questao3 {

	public static void main(String[] args) {
		
		
		double valor;
		
		
		valor = Teclado.lerInt("Digite o valor em U$: ");
		
		System.out.println("Valor do Dolar em Reais é: " + valor * 3.80);
		
		

	}

}
