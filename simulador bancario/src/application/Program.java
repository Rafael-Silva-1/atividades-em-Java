package application;

import java.util.Locale;
import java.util.Scanner;
import util.bankingSystem;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        bankingSystem account1;
		double deposit;
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        sc.nextLine(); // consome a quebra de linha pendente
        
        System.out.print("Enter account holder: ");
        String cardholderName = sc.nextLine();
        
        System.out.print("Is there an initial deposit? (y/n): ");
        char opcao = sc.next().charAt(0);
        if (opcao == 'y') {
        	System.out.print("Enter initial deposit value: ");
        	deposit = sc.nextDouble();
        	account1 = new bankingSystem(accountNumber, cardholderName, deposit);
        }else {
        	account1 = new bankingSystem(accountNumber, cardholderName);
        }
        
        
        
        System.out.println();
        System.out.println(account1);
        
        System.out.println();
        System.out.print("Enter deposit value: ");
        deposit = sc.nextDouble();
        account1.enterValue(deposit);
        System.out.println("Updated account data:");
        System.out.println(account1);
        
        
        System.out.println();
        System.out.print("Enter withdraw value: ");
        double withdraw = sc.nextDouble();
        account1.exitValue(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account1);
       
        
        sc.close();
	}

}
