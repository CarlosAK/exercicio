package br.com.questao;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		
		
		double atraso, valor, taxa;
		
		atraso = Teclado.lerDouble("Digite os dias em atraso: ");
		valor = Teclado.lerDouble("Digite o valor da prestaçao: ");
		taxa = Teclado.lerDouble("Digite o valor da taxa(EM %): ");
		
		valor = valor + (valor * (taxa/100) * atraso);
		
		System.out.println("Valor da Prestaçao em atraso: " + valor);

	}

}
