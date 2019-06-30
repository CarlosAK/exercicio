package br.com.questao;

import br.com.util.Teclado;

public class Questao9 {

	public static void main(String[] args) {
		
		double numb, raiz, qd;
		
		numb = Teclado.lerInt("Digite um valor: ");
		
		qd = Math.pow(numb, 2);
		
		raiz = Math.sqrt(numb);
		
		System.out.println("O valor digitado foi: " + numb);
		System.out.println("O quadrado é: " + qd);
		System.out.println("A raiz quadrada é: " + raiz);

	}

}
