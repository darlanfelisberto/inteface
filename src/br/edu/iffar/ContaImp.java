package br.edu.iffar;

public class ContaImp implements Conta{

	private float saldo;
	
	public boolean sacar(float valor) {
		if(this.saldo > valor) {
			this.saldo-=valor;
			return true;
		}
		
		return false;
	}

	public void depositar(float valor) {
		this.saldo = saldo + valor;
	}

	public void mostraSaldo() {
		System.out.println("Saldo da conta é:" + this.saldo);
	}

}
