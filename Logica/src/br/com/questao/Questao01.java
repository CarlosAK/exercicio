package br.com.questao;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		
		
		String nome;
		String sexo;
		
		nome = Teclado.lerTexto("Digite o nome ");
						
		sexo = Teclado.lerTexto("Digite o sexo ");
		
		System.out.println("o nome informado foi: " + nome);
		System.out.println("o sexo informado foi: " + sexo);

	}

}
