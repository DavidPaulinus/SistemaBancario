import java.util.Scanner;

abstract class SistemaBancario {
	Scanner sc = new Scanner(System.in);

	private String nomeCliente;
	private int numConta;
	private double saldo;
	private double limite;

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public final String NOME_CLIENTE() {
		return "DAVI SOUZA";
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public final int NUM_CONTA() {
		return 123456;
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

	public void dados() {
		System.out.print("Insira seu nome: ");
		String nome = sc.nextLine();
		setNomeCliente(nome);

		System.out.print("Insira o número do cartão: ");
		int num = sc.nextInt();
		setNumConta(num);

		sc.nextLine();
	}

	public void sacar(double saque) {
		if (saque > this.getLimite()) {
			System.out.println("Não é possível sacar um valor maior do que o permitido pelo seu limite.");

		}
		if (saque > this.getLimite() && saque > this.getSaldo()) {
			System.out.println("Você não tem saldo nem limite para efetuar esse saque.");

		}
		if (saque <= this.getSaldo() && saque > 0) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saque efetuado!\n");

			System.out.println("Saldo: R$" + this.getSaldo() + "\n");

		}
		if (saque == 0) {
			System.out.println("Muito engraçadinho você ein.");

		}
		if (saque > this.getSaldo() && saque < this.getLimite()) {
			System.out.println("Você não pode sacar um valor acima do seu saldo");

		}

	}

	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Depósito efetuado!\n");

		System.out.println("Saldo: R$" + this.getSaldo() + "\n");
	}

	public void emprestar(double numero, int n) {
		if (n == 0) {
			System.out.println("Já passou seu limite de empréstimos");
		}else {
			if (numero > 500) {
				System.out.println("Valor acima do empréstimo acima do permitido");
				
			}else {
				System.out.println("Empréstimo de R$" + numero + " realizado com sucesso!");
				n--;
			}
			
		}

	}
}
