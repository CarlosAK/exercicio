	package br.com.laco;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <=15; i++) {
			int multiplicacao = 1;
			for (int c = 0; c <i; c++) {
				multiplicacao *= 3;
			}
			System.out.println("3 elevado á " + i +" = " + multiplicacao);
		}

	}

}
