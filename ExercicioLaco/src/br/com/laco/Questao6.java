package br.com.laco;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 51;
		int soma = 0;
		while(numero >= 51) {
			numero = Teclado.lerInt("Insira um numero menor ou igual a 50: ");
		}
		
		
		if (numero * 3 < 250) {
			soma += numero * 3;
		}
		
		
		System.out.println("A multipolicação sucessiva de " + numero + " por 3 antes de 250 é: " + soma);
		
		
	}

}
