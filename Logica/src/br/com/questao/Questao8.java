package br.com.questao;

import br.com.util.Teclado;

public class Questao8 {

	public static void main(String[] args) {
		
		int dist, consumo, litros;
		
		dist = Teclado.lerInt("Distancia percorrida em KM: ");
		consumo = Teclado.lerInt("Consumo medio por KM: ");
		
		litros = (dist / consumo);
		
		System.out.println("A quantidade de litros gasto é: " + litros + " Litros");

	}

}
