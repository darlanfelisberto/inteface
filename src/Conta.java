class Conta{
	float saldo;
	String nome;
	
	Conta(String nome){
		this.nome = nome;
	}
	
	boolean sacar(float valor) {
		this.saldo-=valor;
		return true;
	}
	
	void depositar(float valor) {
		this.saldo = saldo + valor;
	}
}
