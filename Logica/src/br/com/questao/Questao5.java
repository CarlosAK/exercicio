package br.com.questao;

import br.com.util.Teclado;

public class Questao5 {

	public static void main(String[] args) {
		
		
		double salario;
		
		salario = Teclado.lerDouble("Digite seu salario: ");
		System.out.println("Salario com acrescimo de 15% é: " 
							+ (salario + salario *.15));

	}

}
