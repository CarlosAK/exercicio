package br.com.orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno novoaluno = new Aluno();
		Aluno novoaluno2 = new Aluno();
		
		novoaluno.Nome = "Maria";
		novoaluno.rg = 1593570;
		novoaluno.DataNasc = "01/01/2000";
		
		System.out.println("O nome do aluno é: " + novoaluno.Nome);
		System.out.println("O RG do aluno é: " + novoaluno.rg);
		System.out.println("A data de nascimento do aluno é: " +novoaluno.DataNasc);
		
		
		
		novoaluno2.Nome = "Ana";
		novoaluno2.rg = 9517530;
		novoaluno2.DataNasc = "08/07/1995";
		
		System.out.println("O nome do aluno é: " + novoaluno2.Nome);
		System.out.println("O RG do aluno é: " + novoaluno2.rg);
		System.out.println("A data de nascimento do aluno é: " +novoaluno2.DataNasc);
		
		System.out.println("____________________________________________________");
		
		Turma novaturma = new Turma();
		Aluno novoaluno1 = new Aluno();
		
		novaturma.TipoEnsino = "Fundamental";
		novaturma.periodo = "Vespertino";
		novaturma.serie = 7;
		novaturma.sigla = "B";
		novoaluno1.Nome = "Ana";
		novoaluno1.rg = 24510086;
		novoaluno1.DataNasc = "21/07/2008";
		novoaluno1.turma = novaturma;
		System.out.println("Nome do aluno: " + novoaluno1.Nome);
		System.out.println("Data de nascimento de " + novoaluno1.Nome + " é: " + novoaluno1.DataNasc);
		System.out.println("Aluno esta no ensino: " + novoaluno1.turma.TipoEnsino);
		System.out.println("Estuda no periodo: " + novoaluno1.turma.periodo);
		System.out.println("Aluno está no: " + novoaluno1.turma.serie + "º ano");
		
				

	}

}
