
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		//conta.numero = 1337;
		//altera��o � a mesma, mas agora com o encapsulamento estamos protegidos,
		//quando precisar alterar o funcionamento interno s� alteraremos em um �nico lugar.
		
		// a forma como conversamos com o objeto � atrav�s dos m�todos, � a interface do objeto.
		// o atributo esta sempre escondido e se alterarmos n�o vai alterar o modo do usu�rio usar.
	
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		//paulo.nome = "Paulo Silveira";
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo); //pega titular muda o nome
		System.out.println(conta.getTitular().getNome()); // mostra titular e o nome
		
		conta.getTitular().setCpf("222.222.222-22");
		System.out.println(conta.getTitular().getCpf());
		
		conta.getTitular().setProfiss�o("Programador");
		System.out.println(conta.getTitular().getProfiss�o());
		
		//agora em duas linhas.
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfiss�o("programador");
		
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}

}
