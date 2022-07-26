class Main {
	public static void main(String[] args) {
		Conta conta =  new Conta("Darlan");
		
		conta.depositar(500f);
		
		conta.sacar(100f);
		
		System.out.println("O saldo de " + conta.nome + " é " + conta.saldo);
	}
}
