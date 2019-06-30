package br.com.questao2;

import br.com.util.Teclado;

public class Questao5 {

	public static void main(String[] args) {
		
		double n1, n2, soma, sub1, sub2, div, mult, mod;
		
		n1 = Teclado.lerDouble("Digite o primeiro numero: ");
		n2 = Teclado.lerDouble("Digite o segundo numero: ");
		
		soma = n1 + n2;
		sub1 = n1 - n2;
		sub2 = n2 - n1;
		div = n1 / n2;
		mult = n1 * n2;
		mod = n1 % n2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Sub1: " + sub1);
		System.out.println("Sub2: " + sub2);
		System.out.println("Divisao: " + div);
		System.out.println("Mult: " + mult);
		System.out.println("Mod: " + mod);
		
		
		
		/*n1 = Teclado.lerDouble("Digite o primeiro numero: ");
		n2 = Teclado.lerDouble("Digite o segundo numero: ");
		
		System.out.println("A Somas dos numero é de: " + (n1+n2));
		System.out.println("A subtraçao dos numeros é de: " + (n1-n2));
		System.out.println("A multiplicaçao dos numeros é de: " + (n1*n2));
		System.out.println("A divisao dos numeros é de: " + (n1/n2));
		System.out.println("O resta da divisao é de: " + (n1%n2));
		*/

	}

}
