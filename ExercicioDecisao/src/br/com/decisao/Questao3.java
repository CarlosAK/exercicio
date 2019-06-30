package br.com.decisao;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		
		if(numero % 2 == 0) {
			System.out.println("O numero é par");
		}
		
		else {
			System.out.println("O numero é impar");
		}

	}

}
