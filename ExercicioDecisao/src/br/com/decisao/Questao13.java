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
				System.out.println("A ordem �: " + c + " " + b + " " + a);
			}
			if(c >= b) {
				System.out.println("A ordem �: " + b + " " + c + " " + a);
			}
			
			
		}
		
		else if(b >= a && b >= c) {
			if(a >= c) {
				System.out.println("A ordem �: " + c + " " + a + " " + b);
			}
			if(c >= a) {
				System.out.println("A ordem �: " + a + " " + c + " " + b);
			}
			
		}
		
		else if(c >= a && c >= b) {
			if(b >= a) {
				System.out.println("A ordem �: " + a + " " + b + " " + c);
			}
			if(a >= b) {
				System.out.println("A ordem �: " + b + " " + a + " " + c);
			}
		}

	}

}
