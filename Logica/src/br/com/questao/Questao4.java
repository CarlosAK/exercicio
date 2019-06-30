package br.com.questao;

import br.com.util.Teclado;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		num = Teclado.lerInt("Digite um numero: ");
		System.out.println("o antecessor é: " + (num -1));
		System.out.println("o sucessor é: " + (num +1));

	}

}
