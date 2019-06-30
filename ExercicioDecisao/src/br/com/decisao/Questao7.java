package br.com.decisao;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero inteiro positivo ou negativo: ");
		
		if(numero >= 0) {
			System.out.println("O modulo deste numero é: " + numero);
		}
		
		else {
			System.out.println("O modulo deste numero é: " + (-(numero)));
		}

	}

}
