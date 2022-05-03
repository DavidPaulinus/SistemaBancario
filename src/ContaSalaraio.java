
public class ContaSalaraio extends SistemaBancario {
	
	public void sacar(double saque) {
		if(saque>this.getLimite()) {
			System.out.println("N�o � poss�vel sacar um valor maior do que o permitido pelo limite.");
			
		}else {
			if(saque<=this.getSaldo() && saque>0) {
				this.setSaldo(this.getSaldo()-saque);
				System.out.println("Saldo: R$"+this.getSaldo());
				
			}else {
				System.out.println("Voc� n�o pode sacar um valor acima do seu saldo");
			}
			
		}
	}
	
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo()+deposito);
		System.out.println("Saldo: R$"+this.getSaldo());
	}

}
