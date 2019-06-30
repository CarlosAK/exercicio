package br.com.questao;

import br.com.util.Teclado;

public class Questao6 {

	public static void main(String[] args) {
		
		
		double temp;
		
		temp = Teclado.lerInt("Digite a temperatura e Fahrenheit: ");
		System.out.println("A temperatura em graus Celsius é: " + (((temp - 32) *5/9)));

	}

}
