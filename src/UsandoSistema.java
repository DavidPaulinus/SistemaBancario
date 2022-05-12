import java.util.Scanner;

public class UsandoSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaCorrente contC=new ContaCorrente();
		ContaSalaraio contSal = new ContaSalaraio();

		String tipo, resp;
		boolean loop = true;

		//contSal.setNomeCliente("JANIO CASTRO ALVES DA SILVA ROCHA SOLZA DUARTE KLEBER SEI LAKKKKK);"//
		
		contSal.setSaldo(1000.0);
		contSal.setLimite(600);
		
		contC.setSaldo(1000.0);
		contC.setLimite(600);

		
		System.out.println("Tipo da conta: \n" + "CC[Conta Corrente]\n" + "CS[Conta Salário]");
		
		tipo=sc.next();
		if(tipo.equalsIgnoreCase("cs")) {
			
			contSal.dados();
			
			if(contSal.getNomeCliente().equalsIgnoreCase(contSal.NOME_CLIENTE())) {
				while(loop==true) {
					
					contSal.contaSalarioFuncoes();
					
					System.out.println("Mais alguma coisa? [s]/[n]");
					resp=sc.next();
					if(resp.equalsIgnoreCase("n")) {
						loop=false;
						
					}
					
				}
				
			}else {
				System.out.println("Nome e/ou número errado");	
			}
			
		}if(tipo.equalsIgnoreCase("cc")) {
			
			contC.dados();
			
			if(contC.getNomeCliente().equalsIgnoreCase(contSal.NOME_CLIENTE())) {
				while (loop==true) {
					
					contC.contaCorrenteFuncoes();
					
					
					System.out.println("Mais alguma coisa? [s]/[n]");
					resp=sc.next();
					if(resp.equalsIgnoreCase("n")) {
						loop=false;
						
					}
				}
				
			}else {
				System.out.println("Nome e/ou número errado");
				
			}
			
		}
		
		
		sc.close();
	}

}
