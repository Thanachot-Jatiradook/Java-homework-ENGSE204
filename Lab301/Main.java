package Lab301;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Name :     ") ;
        String inputUname = scanner.nextLine() ;

        User blehUser = new User(inputUname) ;

        System.out.println("----------result----------") ;
        System.out.println(blehUser.getUsername()) ;

        scanner.close() ;

    }

}
