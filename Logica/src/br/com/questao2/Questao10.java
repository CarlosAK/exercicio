package br.com.questao2;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		
		
		double totaleleitores, totalnulos, totalbrancos, totalvalidos;
		double percnulo, percbranco, percvalido;
		
		
		totaleleitores = Teclado.lerDouble("Digite o total de eleitores:");
		totalnulos = Teclado.lerDouble("Digite o total de nulos: ");
		totalbrancos = Teclado.lerDouble("Digite o total de brancos: ");
		totalvalidos = Teclado.lerDouble("Digite o total de votos validos: ");
		
		percnulo =  totalnulos / totaleleitores * 100;
		percbranco = totalbrancos / totaleleitores * 100;
		percvalido =  totalvalidos / totaleleitores * 100;
		
		System.out.println("O percetual de votos nulos é: " + percnulo +"%");
		System.out.println("O percetual de votos brancos é: " + percbranco + "%");
		System.out.println("O percetual de votos validos é " + percvalido + "%");
	




	}

}
