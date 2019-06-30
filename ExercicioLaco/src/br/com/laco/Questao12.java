package br.com.laco;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		numero = Teclado.lerInt("Digite um numero real: ");
		
		
		if( numero == -1) {
			System.out.println("O maior e menor número são iguais: -1" );
		}
		
		else{
		
			double maiornumero = numero;
			double menornumero = numero;
			double media = 0.0;
			int controle = 0;
		
			while(numero != -1) {
						
				if(numero > maiornumero) {
					maiornumero = numero;
				}				
				
				if(numero <= menornumero) {
					menornumero = numero;
				}
								
				media += numero;
				controle += 1;
								
				numero = Teclado.lerInt("Digite um numero real diferente de -1 se deseja continuar: ");
							
			}
						
			System.out.println("O maior numero é: " + maiornumero);
			System.out.println("O menor numero é: " + menornumero);
			System.out.println("A media é: " + (media/controle));
	
		}

	}

}
