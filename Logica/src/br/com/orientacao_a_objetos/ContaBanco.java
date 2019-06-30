package br.com.orientacao_a_objetos;

public class ContaBanco {
	
	public int numero;
	public double saldo;
	public double limite = 100;
	public Agencia agencia;
	
	String extrato = "";
	
	public void deposito(double valor) {
		this.saldo += valor;
		extrato ("Deposito de: " + valor);
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		extrato ("saque de: " + valor); 
	}
	
	public String saldo() {
		String saldo = "Seu saldo é: " + (this.saldo + this.limite );
		return saldo;
	}
	
	public String extrato(String evento) {
		
		if (!evento.equalsIgnoreCase("Verificar"))
			extrato += evento + "\n";
		
		return extrato;
	}
	
	
	

}
