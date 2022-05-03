
public class ContaCorrente extends SistemaBancario {

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

	public void emprestar(double numero) {
		int n=5;
		if(n==0) {
			System.out.println("J� passou seu limite de empr�stimos");
		}else {
			if(numero>500) {
				System.out.println("Valor acima do empr�stimo acima do permitido");;
				
			}else {
				n--;
				System.out.println("Empr�stimo de R$"+numero+" realizada com sucesso!");				
			}
			
		}	
	}

	
}
