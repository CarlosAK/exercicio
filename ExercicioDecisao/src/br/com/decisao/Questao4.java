package br.com.decisao;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero inteiro: ");
		
		if(numero % 4 == 0 && numero % 5 == 0) {
			System.out.println(numero);
		}
		
		else {
			System.out.println("O numero nao é divisivel por 4 e 5!");
		}

	}

}
