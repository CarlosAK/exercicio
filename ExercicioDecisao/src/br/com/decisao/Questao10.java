package br.com.decisao;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		num1 = Teclado.lerInt("Digite o primeiro numero");
		num2 = Teclado.lerInt("Digite o segundo numero");
		
		if(num1 % num2 == 0) {
			System.out.println(num2 + " é um divisor de: " + num1);
		}
		
		else {
			System.out.println(num2 + " nao é um divisor de " + num1);
		}

	}

}
