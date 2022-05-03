import java.util.Scanner;

public class UsandoSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaCorrente contCorr = new ContaCorrente();
		ContaSalaraio contSal = new ContaSalaraio();

		String nome, resp, tipo;
		int num;
		double n;
		boolean loop = true;

		//contSal.setNomeCliente("JANIO CASTRO ALVES DA SILVA ROCHA SOLZA DUARTE KLEBER SEI LAKKKKK);"//
		
		contCorr.setNomeCliente("SOUZA DAVI");
		contCorr.setNumConta(654321);
		contCorr.setSaldo(1000.0);
		contCorr.setLimite(600);
		
		contSal.setNomeCliente("DAVI SOUZA");
		contSal.setNumConta(123456);
		contSal.setSaldo(1000.0);
		contSal.setLimite(600);

		System.out.println("Tipo da conta: \n" + "CC[Conta Corrente]\n" + "CS[Conta Salário]");

		tipo = sc.next();
		if (tipo.equalsIgnoreCase("CS")) {
			sc.nextLine();
			
			System.out.print("Insira seu nome: ");
			nome = sc.nextLine();

			System.out.print("Insira o número do cartão: ");
			num = sc.nextInt();

			if (num == contSal.NUM_CONTA() && nome.equalsIgnoreCase(contSal.NOME_CLIENTE())) {
				while (loop == true) {
					System.out.println("\nO que deseja?\n" 
							+ "[1]Sacar;\n" 
							+ "[2]Depositar;\n" 
							+ "[3]Ver saldo.");
					num = sc.nextInt();

					switch (num) {
					case 1:
						System.out.println("Saldo atual: R$" + contSal.getSaldo());
						
						System.out.print("Valor a ser sacado: R$");
						n = sc.nextDouble();
						contSal.sacar(n);
						break;
					case 2:
						System.out.println("Saldo atual: R$" + contSal.getSaldo());
						
						System.out.print("Valor a ser depositado: R$");
						n = sc.nextDouble();
						contSal.depositar(n);
						break;
					case 3:
						System.out.println("Saldo atual: R$" + contSal.getSaldo());
						break;
					}
					
					System.out.println("Quer fazer outra coisa? [s]/[n]");
					resp = sc.next();
					if (resp.equalsIgnoreCase("n")) {
						loop = false;
					}
				}

			} 
			else {
				System.out.println("Nome e/ou número da conta está errado.");
			}

		}
		if (tipo.equalsIgnoreCase("CC")) {
			sc.nextLine();
			
			System.out.print("Insira seu nome: ");
			nome = sc.nextLine();
			nome.toUpperCase();

			System.out.print("Insira o número do cartão: ");
			num = sc.nextInt();

			if (num == contCorr.NUM_CONTA() && nome.equalsIgnoreCase(contCorr.NOME_CLIENTE())) {
				while (loop == true) {
					System.out.println("\nO que deseja?\n" 
							+ "[1]Sacar;\n" 
							+ "[2]Depositar;\n" 
							+ "[3]Ver saldo;\n"
							+ "[4]Empréstimo.");
					num = sc.nextInt();

					switch (num) {
					case 1:
						System.out.println("Saldo atual: R$" + contCorr.getSaldo());
						
						System.out.print("Valor a ser sacado: R$");
						n = sc.nextDouble();
						contCorr.sacar(n);
						break;
					case 2:
						System.out.println("Saldo atual: R$" + contCorr.getSaldo());
						
						System.out.print("Valor a ser depositado: R$");
						n = sc.nextDouble();
						contCorr.depositar(n);
						break;
					case 3:
						System.out.println("Saldo atual: R$" + contCorr.getSaldo());
						break;
					case 4:
						System.out.println("Saldo atual: R$" + contCorr.getSaldo());
						
						System.out.print("Quanto deseja pegar emprestado? R$");
						n=sc.nextDouble();
						break;
					}
					
					System.out.println("Quer fazer outra coisa? [s]/[n]");
					resp = sc.next();
					if (resp.equalsIgnoreCase("n")) {
						loop = false;
					}
				}

			} 
			else {
				System.out.println("Nome e/ou número da conta está errado.");
			}

		}
		else {
			System.out.println("Opção inválida.");
		}

		sc.close();
	}

}
