
public class TestaMetodos {
	public static void main(String[] args) {
		
		Conta contaDoMateus = new Conta();
		contaDoMateus.deposita(150);
		System.out.println("Mateus come�ou com: " + contaDoMateus.saldo);
		
		Conta contaDoErick = new Conta();
		contaDoErick.deposita(500);
		System.out.println("Erick come�ou com: " + contaDoErick.saldo);

		
		contaDoErick.transfere(contaDoMateus, 100);
		System.out.println("Saldo do Mateus: " + contaDoMateus.saldo);
		
		
		contaDoMateus.saca(120);
		System.out.println("Saldo do Mateus" + contaDoMateus.saldo);
		
		
		
		
	}

}
