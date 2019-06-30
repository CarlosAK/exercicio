package br.com.decisao;

public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		
		numero = Teclado.lerDouble("Digite um numero: ");
		
		if(numero <0) {
			System.out.println("O numero digitado é negativo");
		}
		
		else if(numero == 0) {
			System.out.println("O numero digitado é nulo");
		}
		
		else {
			System.out.println("O numero digitado é positivo");
		}
		

	}

}
