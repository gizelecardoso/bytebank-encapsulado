public class Conta {

	// Temos 4 atributos - características - o que toda conta tem.
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//comportamentos - o que toda conta faz. - MÉTODOS, maneira de fazer algo.
	// nome do método - deposita, 
	//entre parenteses o que recebe, no caso o valor e o tipo da variável valor, no caso double.
	//nesse caso não terá retorno, então ele é um void.
	
	//construtores
	
	public Conta(int agencia, int numero) {
		
		Conta.total++;
		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
		
	}
	
	public void deposita(double valor) {
		
		//saldo é um atributo por isso está azul. Valor é uma variável normal.
		this.saldo += valor; //this.saldo = this.saldo + valor;
		
	}
	
	// já sei em que conta estou, eu já estou orientado a um objeto.
	
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
			System.out.println("Não pode valor menor igual a zero");
			return;
		}

		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("náo pode valor menor igual a 0");
			return; //retorna nada porque é um void
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
