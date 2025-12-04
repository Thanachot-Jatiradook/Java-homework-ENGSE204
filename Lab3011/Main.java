package Lab3011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Amount Of Your Command :     ");

        if (scanner.hasNextInt()) {
            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                System.out.println("Enter Your Command :     ");
                String command = scanner.next() ;
                

                SystemConfig blehConfig = SystemConfig.getInstance() ;

                if (command.equals("SET_URL")) {

                    System.out.println("--------------------------");

                    System.out.println("Enter Your URL :     ");
                    String newUrl = scanner.next() ;
                    blehConfig.setServerUrl(newUrl) ;

                    System.out.println("--------------------------");

                }

                else if (command.equals("SET_MAX")) {

                    System.out.println("--------------------------");

                    System.out.println("Enter Your Max Connection");
                    int newMax = scanner.nextInt() ;
                    blehConfig.setMaxConnections(newMax) ;

                    System.out.println("--------------------------");

                }

                else if (command.equals("SHOW")) {

                    System.out.println("--------------------------");

                    System.out.println("URL :     " + blehConfig.getServerUrl()) ;
                    System.out.println("MAX :     " + blehConfig.getMaxConnections()) ;

                    System.out.println("--------------------------");

                }

            }

        }

        scanner.close();

    }

}
