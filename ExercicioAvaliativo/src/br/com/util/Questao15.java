package br.com.util;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nome = new String[4];
		double[] salariobruto = new double[4];
		String[] valoraliquota = new String[4];
		double[] salarioliquido = new double[4];
		
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Digite seu nome: ");
			salariobruto[i] = Teclado.lerDouble("Digite seu salario: ");
			if (salariobruto[i]  < 600.00) {
				valoraliquota[i] = "Isento";
				salarioliquido[i] = salariobruto[i];
			}
			else if ( salariobruto[i] >= 600.00 && salariobruto[i] < 1500.00) {
				valoraliquota[i] = "10% do salário bruto";
				salarioliquido[i] =   salariobruto[i] - (salariobruto[i] * 0.10);
			}
			else {
				valoraliquota[i] = "15% do salário bruto";
				salarioliquido[i] = salariobruto[i] - (salariobruto[i] * 0.15);
			}
		}
						
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Nome: " + nome[i]);
			System.out.println("Valor da aliquota: " + valoraliquota[i]);
			System.out.println("Salario com desconto: " + salarioliquido[i]);
			System.out.println("--------");
		}
				
	}

	}


