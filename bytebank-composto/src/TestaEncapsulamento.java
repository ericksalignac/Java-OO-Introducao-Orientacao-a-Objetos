
public class TestaEncapsulamento {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2446);
		conta.deposita(100);
		
		Cliente erick = new Cliente();
		
		conta.setTituar(erick);
		
		conta.getTitular().setNome("Erick");
		conta.getTitular().setCpf("777.777.777-77");
		conta.getTitular().setProfissão("Programador");
		
		conta.saca(55);
		
		System.out.println(conta.getSaldo());
		System.out.println(erick.getProfissão());
		
	}
	

}
