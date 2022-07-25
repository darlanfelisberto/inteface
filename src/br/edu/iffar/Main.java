package br.edu.iffar;

public class Main {
	public static void main(String[] args) {
		Conta conta = (Conta) new ContaImp();
		
		conta.depositar(500f);
		
		conta.sacar(100f);
		
		conta.mostraSaldo();
	}
}
