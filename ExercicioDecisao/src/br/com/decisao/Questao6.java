package br.com.decisao;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		num1 = Teclado.lerInt("Digite o primeiro numero: ");
		num2 = Teclado.lerInt("Digite o segundo numero: ");
		
		if(num1 > num2) {
			System.out.println("A diferen�a de " + num1 + " e " + num2 + " �: " + (num1 - num2));
		}
		
		else {
			System.out.println("A diferen�a de " + num2 + " e " + num1 + " �: " + (num2-num1));
		}

	}

}
