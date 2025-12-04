package Lab3013;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Amount Of Your Command :     ") ;

        if (scanner.hasNextInt()) {

            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                System.out.println("Enter Your Command :     ") ;
                String command = scanner.next() ;

                System.out.println("--------------------------") ;

                if (command.equals("SET")) {

                    System.out.println("Enter Your Max Quota :     ");

                    int newMax = scanner.nextInt() ;
                    LicenseManager.setMax(newMax);

                    System.out.println("--------------------------");

                }

                else if (command.equals("CHECKOUT")) {

                    LicenseManager.checkOut() ;
                    
                    System.out.println("--------------------------");

                }

                else if (command.equals("CHECKIN")) {

                    LicenseManager.checkIn() ;

                    System.out.println("--------------------------");
                }
                
                else if (command.equals("STATUS")) {

                    LicenseManager.displayStatus() ;

                    System.out.println("--------------------------");

                }

            }

        }

        scanner.close();
    }

}
