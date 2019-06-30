package br.com.util;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base;
		int expoente;
		
		base = Teclado.lerInt("Digite o numero da base: ");
		expoente = Teclado.lerInt("Digite o expoente: ");
		int soma = base;
		
		for (int i = 1; i <expoente; i++ ) {
		soma *= base;
		}
		
		System.out.println(base + "** a " + expoente + "=" + soma);
		
		
	}

	

}
