
public class ExtratoBancario {
	private String conta;
	private String saques;
	private String depositos;
	private String transferencia;
	
	
	public ExtratoBancario(String conta, String saques, String depositos, String transferencia) {
		super();
		this.conta = conta;
		this.saques = saques;
		this.depositos = depositos;
		this.transferencia = transferencia;
	}
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getSaques() {
		return saques;
	}
	public void setSaques(String saques) {
		this.saques = saques;
	}
	public String getDepositos() {
		return depositos;
	}
	public void setDepositos(String depositos) {
		this.depositos = depositos;
	}
	public String getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(String transferencia) {
		this.transferencia = transferencia;
	}
}
