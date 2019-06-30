package br.com.questao2;

import br.com.util.Teclado;

public class Questao6 {

	public static void main(String[] args) {


		String nome;
		double salario, com, total;
		int vendas;
		
		nome = Teclado.lerTexto("Digite o nome do vendedor: ");
		salario = Teclado.lerDouble("Digite o salario: ");
		vendas = Teclado.lerInt("Digite o numero de vendas: ");
		
		com = salario * 0.15;
		total = com + salario;
		
		System.out.println(" Salario: " + salario);
		System.out.println("Comissao: " + com);
		System.out.println("Total: " + total);
		
		/*System.out.println("Seu Salario fixo é de: " + salario);
		System.out.println("Sua comissao é de: " + (vendas * .15));
		System.out.println("Seu salario completo é de: " + (salario + vendas * .15));
		*/
		
	}

}
