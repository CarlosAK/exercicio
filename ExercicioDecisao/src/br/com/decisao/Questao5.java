package br.com.decisao;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		nota1 = Teclado.lerDouble("Digite a primeira nota: ");
		nota2 = Teclado.lerDouble("Digite a segunda nota: ");
		nota3 = Teclado.lerDouble("Digite a terceira nota: ");
		nota4 = Teclado.lerDouble("Digite a quarta nota: ");
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if(media >=5) {
			System.out.println("Aluno aprovado com media: " + media);
			
		}
		
		else {
			System.out.println("Aluno reprovado com media: " + media);
		}

	}

}
