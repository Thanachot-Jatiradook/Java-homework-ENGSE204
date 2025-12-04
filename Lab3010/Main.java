package Lab3010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Amount Of Your Command :     ") ;
        if (scanner.hasNextInt()) {
            
            int n = scanner.nextInt() ;

            for (int i = 0; i < n; i++) {

                System.out.println("LOG or SET ? :     ") ;
                String command = scanner.next() ;
                System.out.println("------------------------");

                if (command.equals("SET")) {

                    System.out.println("Enter Your SET Level :     ");
                    int level = scanner.nextInt() ;
                    SystemLogger.setLogLevel(level) ;

                }

                else if (command.equals("LOG")) {

                    System.out.println("Enter Your LOG Level :     ");
                    int level = scanner.nextInt() ;

                    System.out.println("Enter Your LOG :     ");
                    String message = scanner.nextLine().trim() ;

                    if (message.isEmpty()) {

                        message = scanner.nextLine().trim() ;

                    }

                    SystemLogger.log(level, message);

                }

            }

        }

        scanner.close();

    }

}
