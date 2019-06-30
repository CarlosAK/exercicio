package br.com.laco;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int tab = 3; tab <= 6; tab++) {
			System.out.println("Tabuada de " + tab);
			for (int num = 0; num <= 10; num++) {
				System.out.println(tab + " x " + num + " = " + (tab*num));
			}
		}		
	}

}
