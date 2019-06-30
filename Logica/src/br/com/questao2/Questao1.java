package br.com.questao2;

import br.com.util.Teclado;

public class Questao1 {

	public static void main(String[] args) {
		
		double conta;
				
		conta = Teclado.lerDouble("Digite o valor da conta: ");
		
		
		System.out.println("O valor total com os 10% é de R$: " + (conta + conta *.10));

	}

}
