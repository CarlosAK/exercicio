package br.com.decisao;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		
		numero = Teclado.lerDouble("Digite um numero: ");
		
		if(numero > 20) {
			System.out.println("A metade de " + numero + " é: " + (numero/2));
		}
		
		else {
			System.out.println("O numero digita foi: " + numero);
		}

	}

}
