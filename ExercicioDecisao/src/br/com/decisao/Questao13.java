package br.com.decisao;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		double b;
		double c;
		
		a = Teclado.lerDouble("Digite o primeiro numero: ");
		b = Teclado.lerDouble("Digite o segundo numero: ");
		c = Teclado.lerDouble("Digite o terceiro numero: ");
		
		if(a >= b && a >= c) {
			if(b >= c) {
				System.out.println("A ordem é: " + c + " " + b + " " + a);
			}
			if(c >= b) {
				System.out.println("A ordem é: " + b + " " + c + " " + a);
			}
			
			
		}
		
		else if(b >= a && b >= c) {
			if(a >= c) {
				System.out.println("A ordem é: " + c + " " + a + " " + b);
			}
			if(c >= a) {
				System.out.println("A ordem é: " + a + " " + c + " " + b);
			}
			
		}
		
		else if(c >= a && c >= b) {
			if(b >= a) {
				System.out.println("A ordem é: " + a + " " + b + " " + c);
			}
			if(a >= b) {
				System.out.println("A ordem é: " + b + " " + a + " " + c);
			}
		}

	}

}
