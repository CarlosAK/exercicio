package br.com.questao;

import br.com.util.Teclado;

public class Questao2 {

	public static void main(String[] args) {
		
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		
		
		n1 = Teclado.lerInt("Digite o primeiro numero: ");
		n2 = Teclado.lerInt("Digite o segundo numero: ");
		n3 = Teclado.lerInt("Digite o terceiro numero: ");
		n4 = Teclado.lerInt("Digite o quarto numero: ");
		
		System.out.println("A soma dos numeros é: " + (n1+n2+n3+n4));
		System.out.println("A multiplicaçao dos numeros é: " + (n1*n2*n3*n4));
		
	}

}
