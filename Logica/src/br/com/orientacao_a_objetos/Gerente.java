package br.com.orientacao_a_objetos;

public class Gerente {
	
	public String nome;
	public double salario;
	
	public void beneficiosalario() {
		this.salario *= 1.5;
	}
	
	public void aumentarsalario(double taxa) {
		this.salario *= (1 + (taxa /100));
	}

}
