package br.com.questao2;

import br.com.util.Teclado;

public class Questao9 {

	public static void main(String[] args) {
		
		int ano, mes, dia, total;
		
		ano = Teclado.lerInt("Anos: ");
		mes = Teclado.lerInt("Mes: ");
		dia = Teclado.lerInt("Dias: ");
		
		total = (ano * 365) + ( mes *30) + dia;
		
		System.out.println("Dias: " + total);

	}

}
