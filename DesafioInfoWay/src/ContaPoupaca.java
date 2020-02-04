
public class ContaPoupaca extends Conta{

	@Override
	void sacar(double valor) {
		double saldo = super.getSaldo() - valor;
		super.setSaldo(saldo); 
		
	}

	@Override
	void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void transferir(double valor, Conta conta) {
		// TODO Auto-generated method stub
		
	}

}
