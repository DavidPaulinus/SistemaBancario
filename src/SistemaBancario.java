
public abstract class SistemaBancario {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	private double limite;
	
	
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente=nomeCliente;
	}	
	public final String NOME_CLIENTE() {
		return this.nomeCliente;
	}
	
	public void setNumConta(int numConta) {
		this.numConta=numConta;
	}	
	public final int NUM_CONTA() {
		return this.numConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	
}
