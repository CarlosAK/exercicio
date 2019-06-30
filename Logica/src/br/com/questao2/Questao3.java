package br.com.questao2;

import br.com.util.Teclado;

public class Questao3 {

	public static void main(String[] args) {
		
		
		double alturaM;
		double pesoKg;
		double alturaCm;
		double pesoGr;
		
		alturaM = Teclado.lerDouble("Digite sua altura em Metros: ");
		pesoKg = Teclado.lerDouble("Digite seu peso em KG: ");
		
		alturaCm = alturaM*100;
		pesoGr = pesoKg*1000;
		
		System.out.println("a sua altura em cm é de: " + alturaCm + " cm");
		System.out.println("o seu peso em Gr é de: " + pesoGr + " Gr");
		

	}

}
