
public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (valor <+ this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de " + valor +" realizado com sucesso");

			return true;
		} else {
			System.out.println("Saldo insufuciente");
			return false;
		}
		
	}
	
	public boolean transfere(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferência de R$" + valor + " realizada com sucesso");

			return true;
		} else {
			System.out.println("saldo inuficiente para a transferência");
			return false;
		}
	}

}
