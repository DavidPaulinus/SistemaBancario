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

		System.out.print("Insira o n�mero do cart�o: ");
		int num = sc.nextInt();
		setNumConta(num);

		sc.nextLine();
	}

	public void sacar(double saque) {
		if (saque > this.getLimite()) {
			System.out.println("N�o � poss�vel sacar um valor maior do que o permitido pelo seu limite.");

		}
		if (saque > this.getLimite() && saque > this.getSaldo()) {
			System.out.println("Voc� n�o tem saldo nem limite para efetuar esse saque.");

		}
		if (saque <= this.getSaldo() && saque > 0) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saque efetuado!\n");

			System.out.println("Saldo: R$" + this.getSaldo() + "\n");

		}
		if (saque == 0) {
			System.out.println("Muito engra�adinho voc� ein.");

		}
		if (saque > this.getSaldo() && saque < this.getLimite()) {
			System.out.println("Voc� n�o pode sacar um valor acima do seu saldo");

		}

	}

	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Dep�sito efetuado!\n");

		System.out.println("Saldo: R$" + this.getSaldo() + "\n");
	}

	public void emprestar(double numero, int n) {
		if (n == 0) {
			System.out.println("J� passou seu limite de empr�stimos");
		}else {
			if (numero > 500) {
				System.out.println("Valor acima do empr�stimo acima do permitido");
				
			}else {
				System.out.println("Empr�stimo de R$" + numero + " realizado com sucesso!");
				n--;
			}
			
		}

	}
}
