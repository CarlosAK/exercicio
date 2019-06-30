package br.com.questao2;

import br.com.util.Teclado;

public class Questao4 {

	public static void main(String[] args) {
		
		double altura;
		double peso;
		
		altura = Teclado.lerDouble("Digite sua altura em Metros: ");
		peso = Teclado.lerDouble("Digite seu peso em KG: ");
		
		System.out.println("Seu IMC é de: " + peso/(altura*altura));

	}

}
