package br.com.orientacao_a_objetos;

public class Funcionarios {
	
	public String nome;
	public double salario;
	
	public void aumentarsalario() {
			this.salario *= 1.15;
	}
	
	public String imprimirdados() {
			String dados = "nome: " + this.nome + "\n salario: " + this.salario;
			return dados;
	}

}
