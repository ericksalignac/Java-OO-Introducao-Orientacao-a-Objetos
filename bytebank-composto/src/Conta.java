
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta: " + this.numero);
		System.out.println("Total de contas: " + Conta.getTotal());
	}
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} 
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}

	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTituar(Cliente titular) {
		this.titular = titular;
	}
	
	private static int getTotal() {
		
		return Conta.total; 

	}

}
