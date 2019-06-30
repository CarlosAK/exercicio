package br.com.laco;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anterior = 1;
		int fibonacci = 1;
		int proximo = 1;
		
		System.out.print(anterior + " ");
		
		for (int i = 1; i < 15; i++) {
			System.out.print(fibonacci + " ");
			proximo = fibonacci + anterior;
			anterior = fibonacci;
			fibonacci = proximo;
		}	

	}

}
