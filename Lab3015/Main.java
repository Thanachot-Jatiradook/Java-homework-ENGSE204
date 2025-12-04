package Lab3015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Name :     ");
        String inputUsername = scanner.next() ;

        System.out.println("--------------------------");

        User umane = new User(inputUsername) ;

        System.out.println("Enter Amount OF Your Command :     ");

        if (scanner.hasNextInt()) {

            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                System.out.println("Enter Your Command :     ");
                String command = scanner.next() ;

                System.out.println("--------------------------");

                if (command.equals("SET_POLICY")) {

                    System.out.println("SET YOUR POLICY :     ");
                    int newMax = scanner.nextInt() ;

                    User.setPolicy(newMax) ;

                    System.out.println("--------------------------");
                }

                else if (command.equals("LOGIN")) {
                    
                    System.out.println("Enter Your Password :     ");
                    String password = scanner.next() ;

                    umane.login(password) ;

                    System.out.println("--------------------------");

                }

            }

        }

        scanner.close();

    }

}
