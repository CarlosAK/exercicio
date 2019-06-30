package br.com.questao2;

import br.com.util.Teclado;

public class Questao2 {

	public static void main(String[] args) {
		
		
		double horas, mins, total;
		
		horas = Teclado.lerDouble("Digite as horas: ");
		mins = Teclado.lerDouble("Digite os mins: ");
				
		total = (horas * 60) + mins;
		
		System.out.println("Total em mins apos 00:00 " + total);

	}

}
