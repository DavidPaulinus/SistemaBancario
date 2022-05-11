import java.util.Scanner;

class ContaCorrente extends SistemaBancario {
	Scanner sc = new Scanner(System.in);

	private int n;
	private double valor;

	public void contaCorrenteFuncoes() {
		System.out.println("\nO que deseja?\n" 
						+ "[1]Sacar;\n" 
						+ "[2]Depositar;\n" 
						+ "[3]Ver saldo.");
		n = sc.nextInt();

		switch (n){
		
		
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
			
		default:
			System.out.println("opção inválida");
			break;	
		}

	}

}
