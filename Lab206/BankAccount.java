package Lab206;

import java.util.Scanner;

public class BankAccount {

    String ownerName ;
    double balance = 0 ;

    public BankAccount(String ownerName, double initialBalance) {

        this.ownerName = ownerName ;
        this.balance = initialBalance ;

    }

    public void deposit(double amount) {

        this.balance += amount ;

    }

    public void displaySummary() {

        System.out.println("-----Result-----");
        System.out.println("Owner :     " + this.ownerName) ;
        System.out.println("Balance :     " + this.balance) ;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name :     ") ;
        String inputOwnerName = scanner.nextLine();
        System.out.println("Enter Your InitialBalance :     ") ;
        double inputInitialBalance = scanner.nextDouble();
        System.out.println("Enter Your DepositAmount :     ") ;
        double inputDepositAmount = scanner.nextDouble() ; 

        BankAccount blehAccount = new BankAccount(inputOwnerName, inputInitialBalance) ;

        blehAccount.deposit(inputDepositAmount) ;
        blehAccount.displaySummary() ;

        scanner.close() ;
    }

}
    
