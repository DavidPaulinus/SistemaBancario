import java.util.Scanner;

class ContaSalaraio extends SistemaBancario {
	Scanner sc = new Scanner(System.in);
	
	private int n;
	private double valor;
	
	
	public void contaSalarioFuncoes() {
		
		System.out.println("\nO que deseja?\n" 
				+ "[1]Sacar;\n" 
				+ "[2]Depositar;\n" 
				+ "[3]Ver saldo;\n"
				+ "[4]Empréstimo.");
		n = sc.nextInt();
		
		switch (n) {
		
		
		case 1:
			System.out.println("Saldo atual: R$" + this.getSaldo());
			
			System.out.print("Valor a ser sacado: R$");
			valor=sc.nextDouble();
			this.sacar(valor);
			break;
			
		case 2:
			System.out.println("Saldo atual: R$" + this.getSaldo());
			
			System.out.print("Valor a ser depositado: R$");
			valor=sc.nextDouble();
			this.depositar(valor);
			break;
			
		case 3:
			System.out.println("Saldo atual: R$" + this.getSaldo());
			break;
			
		case 4:
			int n=0;
			System.out.print("Quanto deseja pegar emprestado? R$");
			valor=sc.nextDouble();
			emprestar(valor, n);
			
			break;
			
		default:
			System.out.println("opção inválida");
			break;
		}
	}

}
