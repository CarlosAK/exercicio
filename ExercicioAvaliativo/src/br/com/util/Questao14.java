package br.com.util;

public class Questao14 {

	public static void main(String[] args) {
		
		
		String[] nome = new String[15];
		double[] nota1 = new double[15];
		double[] nota2 = new double[15];
		double[] media = new double[15];
		String[] situacao = new String[15];
		
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Insira o nome: ");
			nota1[i] = Teclado.lerDouble("Insira a primeira nota: ");
			nota2[i] = Teclado.lerDouble("Insira a segunda nota: ");
			
			media[i] = ( nota1[i] + nota2[i] ) /2;
			
			
			if ( media[i] >= 5) {
				situacao[i] = "Aprovado";
			}
			
			else {
				situacao[i] = "Reprovado";
			}
		}
		
		
		for (int i = 0; i< nome.length; i++) {
			System.out.println("Nome: " + nome[i] + "          Notas 1 e 2:     " + nota1[i] + " e " + nota2[i] + "            Media: " + media[i] + "              Situacao: " + situacao[i]);
		}
		
		
	}
}