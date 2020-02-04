
public abstract class Conta {
	private Integer numero;
	private double saldo;
	private Cliente cliente;
	private Banco banco;
	
	abstract void sacar(double valor);
	
	abstract void depositar(double valor);
	
	abstract void transferir(double valor, Conta conta);

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	
	

}
