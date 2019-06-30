package br.com.orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		turma1.periodo = "Vespertino";
		turma1.serie = 8;
		turma1.sigla = "F";
		turma1.TipoEnsino = "Fundamental";
		
		System.out.println("O periodo da turma 1 é: " + turma1.periodo);
		System.out.println("A serie da turma 1 é: " + turma1.serie);
		System.out.println("A sigla da turma 1 é: " + turma1.sigla);
		System.out.println("O ensino da turma 1 é: " + turma1.TipoEnsino);
		
		System.out.println("_____________________________________________");
		
		turma2.periodo = "Noturno";
		turma2.serie = 3;
		turma2.sigla = "A";
		turma2.TipoEnsino = "Médio";
		
		System.out.println("O periodo da turma 2 é: " + turma2.periodo);
		System.out.println("A serie da turma 2 é: " + turma2.serie);
		System.out.println("A sigla da turma 2 é: " + turma2.sigla);
		System.out.println("O ensino da turma 2 é: " + turma2.TipoEnsino);
		
				
		

	}

}
