public class Conta {

	// Temos 4 atributos - caracter�sticas - o que toda conta tem.
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//comportamentos - o que toda conta faz. - M�TODOS, maneira de fazer algo.
	// nome do m�todo - deposita, 
	//entre parenteses o que recebe, no caso o valor e o tipo da vari�vel valor, no caso double.
	//nesse caso n�o ter� retorno, ent�o ele � um void.
	
	//construtores
	
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		System.out.println("O total de contas �: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
		
	}
	
	public void deposita(double valor) {
		
		//saldo � um atributo por isso est� azul. Valor � uma vari�vel normal.
		this.saldo += valor; //this.saldo = this.saldo + valor;
		
	}
	
	// j� sei em que conta estou, eu j� estou orientado a um objeto.
	
	public boolean saca(double valor) {
		
		if(this.saldo>=valor) {
			this.saldo -= valor; //this.saldo = this.saldo - valor;
			
			return true;
		} else {
			return false;
			
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	public double getSaldo() { //pegaSaldo.
		
		return this.saldo;
	}
	
	public int getNumero() {
		
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero<=0) {
			System.out.println("N�o pode valor menor igual a zero");
			return;
		}

		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("n�o pode valor menor igual a 0");
			return; //retorna nada porque � um void
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
