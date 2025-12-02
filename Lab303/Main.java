package Lab303;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Old Password :     ") ;
        String inputInitialpassword = scanner.nextLine() ;

        System.out.println("Enter Your New Password :     ") ;
        String inputUpdateInitialpassword = scanner.nextLine() ;

        User blehUser = new User(inputInitialpassword) ;

        System.out.println("----------result----------") ;
        
        blehUser.setPassword(inputUpdateInitialpassword) ;

        System.out.println(blehUser.getPassword()) ;

        scanner.close();

    }

}
