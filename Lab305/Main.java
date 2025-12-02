package Lab305;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Connection :     ");
        String inputConnectionString = scanner.nextLine();

        DatabaseConnection blehdatabase = new DatabaseConnection(inputConnectionString);

        blehdatabase.connect();
        blehdatabase.disconnect();
        blehdatabase.disconnect();

        System.out.println(blehdatabase.isConnected());

        scanner.close();
    }

}
