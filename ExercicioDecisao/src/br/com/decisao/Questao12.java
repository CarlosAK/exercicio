package br.com.decisao;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maiornum = 0;
		int menornum = 0;
		int[] numeros = new int[5];
		
		for(int i = 0; i < numeros.length; i ++) {
			numeros[i] = Teclado.lerInt("Digite um numero: ");
			
			if(i == 0) {
				maiornum = numeros[i];
				menornum = numeros[i];
			}
			
			if(numeros[i] >= maiornum) {
				maiornum = numeros[i];
			}
			
			if(numeros[i] <= menornum) {
				menornum = numeros[i];
			}
			
			
		}
		
		System.out.println("O maior numero é: " + maiornum);
		System.out.println("O menor numero é: " + menornum);

	}

}
