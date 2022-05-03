
public class ContaCorrente extends SistemaBancario {

	public void sacar(double saque) {
		if(saque>this.getLimite()) {
			System.out.println("Não é possível sacar um valor maior do que o permitido pelo limite.");
			
		}else {
			if(saque<=this.getSaldo() && saque>0) {
				this.setSaldo(this.getSaldo()-saque);
				System.out.println("Saldo: R$"+this.getSaldo());
				
			}else {
				System.out.println("Você não pode sacar um valor acima do seu saldo");
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
			System.out.println("Já passou seu limite de empréstimos");
		}else {
			if(numero>500) {
				System.out.println("Valor acima do empréstimo acima do permitido");;
				
			}else {
				n--;
				System.out.println("Empréstimo de R$"+numero+" realizada com sucesso!");				
			}
			
		}	
	}

	
}
