
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		//conta.numero = 1337;
		//alteração é a mesma, mas agora com o encapsulamento estamos protegidos,
		//quando precisar alterar o funcionamento interno só alteraremos em um único lugar.
		
		// a forma como conversamos com o objeto é através dos métodos, é a interface do objeto.
		// o atributo esta sempre escondido e se alterarmos não vai alterar o modo do usuário usar.
	
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		//paulo.nome = "Paulo Silveira";
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo); //pega titular muda o nome
		System.out.println(conta.getTitular().getNome()); // mostra titular e o nome
		
		conta.getTitular().setCpf("222.222.222-22");
		System.out.println(conta.getTitular().getCpf());
		
		conta.getTitular().setProfissão("Programador");
		System.out.println(conta.getTitular().getProfissão());
		
		//agora em duas linhas.
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissão("programador");
		
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}

}
