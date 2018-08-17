
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2167, 49990);
		
		System.out.println(conta.getAgencia());
		// NÃO DA PORQUE É PRIVADO System.out.println(Conta.total);

		System.out.println(Conta.getTotal());
		
	}
}
