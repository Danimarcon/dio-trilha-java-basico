public class Main {
    public static void main(String[] args) {
		Cliente daniela = new Cliente();
		daniela.setNome("Daniela");
		
		Conta cc = new ContaCorrente(daniela);
		Conta poupanca = new ContaPoupanca(daniela);

		cc.depositar(800);
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
