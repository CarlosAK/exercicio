package br.com.decisao;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero inteiro: ");
		
		if(numero >= 1 && numero <=10) {
			System.out.println("O numero digitado esta na faixa de 1 a 10");
			
		}
		
		else {
			System.out.println("O numero digitado nao esta na faixa de 1 a 10");
		}

	}

}
