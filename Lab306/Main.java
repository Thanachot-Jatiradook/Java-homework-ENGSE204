package Lab306;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Current Monney :     ");
        double inputBalance = scanner.nextDouble() ;

        System.out.println("Enter Your Deposit :     ");
        double inputDeposit = scanner.nextDouble();

        System.out.println("Enter Your Withdraw :     ");
        double inputWithdraw =scanner.nextDouble();

        System.out.println("----------result----------");

        BankAccount blehAccount = new BankAccount(inputBalance);

        blehAccount.deposit(inputDeposit);
        blehAccount.withdraw(inputWithdraw);

        System.out.println("Final Balance :     " + blehAccount.getBalance());

        scanner.close();
    }
}
