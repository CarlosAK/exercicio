package br.com.orientacao_a_objetos;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente novogrt = new Gerente();
		
		novogrt.nome = "Fernando";
		novogrt.salario = 1400;
		System.out.println("Salario é: " + novogrt.salario);
		
		novogrt.beneficiosalario();
		System.out.println("Salario aumentado para: " + novogrt.salario);
		novogrt.aumentarsalario(15);
		System.out.println("Salario aumentado para: " + novogrt.salario);

	}

}
