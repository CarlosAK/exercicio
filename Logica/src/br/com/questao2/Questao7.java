package br.com.questao2;

import br.com.util.Teclado;

public class Questao7 {

	public static void main(String[] args) {
		
		int numprest;
		double conta, valorprest;
		
		numprest = Teclado.lerInt("Digite o numero de presta�ao :");
		conta = Teclado.lerDouble("Digite o valor da compra: ");
		
		valorprest = conta/numprest;
		
		System.out.println("O valor das presta�oes � de: " + valorprest);
		
		
		

	}

}
