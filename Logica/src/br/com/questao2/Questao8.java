package br.com.questao2;

import br.com.util.Teclado;

public class Questao8 {

	public static void main(String[] args) {
		
		double preco, venda, acrescimo, total;
		
		preco = Teclado.lerDouble("Digite o valor do custo: ");
		acrescimo = Teclado.lerDouble("Digite o valor de acrescimo: ");
		
		total = preco + (preco * (acrescimo / 100 ));
		
		System.out.println("valor de venda: " + total);
		System.out.println("valor de custo: " + preco);
		System.out.println("valor de acrescimo: " + acrescimo);
		

	}

}
