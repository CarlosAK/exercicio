package br.com.questao;

import br.com.util.Teclado;

public class Questao7 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		n1 = Teclado.lerInt("Digite o primeiro numero: ");
		n2 = Teclado.lerInt("Digite o segundo numero: ");
		n3 = Teclado.lerInt("Digite o terceiro numero: ");
		
		System.out.println("a media dos numeros é: " + (n1+n2+n3)/3);

	}

}
