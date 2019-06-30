package br.com.laco;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b;
		int e; 
		b = Teclado.lerInt("Digite uma potencia: ");
		e = Teclado.lerInt("Digite o expoente: ");
		
		
		for (int i = 0; i <=e; i++) {
			int multiplicacao = 1;
			for (int c = 0; c <i; c++) {
				multiplicacao *= b;
			}
			System.out.println(b + " elevado á " + i +" = " + multiplicacao);
		}

	}

}
