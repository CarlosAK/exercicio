package br.com.decisao;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		
		numero = Teclado.lerDouble("Digite um numero com 3 casas: ");
		
		int algarismo = (int) numero/100;
		
		System.out.println("A centena do numero digitado é: " + algarismo);

	}

}
