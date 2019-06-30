package br.com.laco;


public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Teclado.lerInt("Digite um numero");
		
		for (int i = 1; i <= 10; i++) {
		
		System.out.println(numero + "." + i + " = " + (numero*i));
		}
	}

	

}
