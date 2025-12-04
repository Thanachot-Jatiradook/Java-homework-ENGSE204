package Lab309;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        
        System.out.println("Enter Your Password Length :     ") ;
        int inputMinLength1 = scanner.nextInt() ;

        scanner.nextLine() ;

        System.out.println("Enter Your Name :     ") ;
        String inputUserName1 = scanner.nextLine() ;
        
        System.out.println("Enter Your Password :     ") ;
        String inputUserPassword1 = scanner.nextLine() ;

        System.out.println("Enter Your Name :     ") ;
        String inputUserName2 = scanner.nextLine() ;

        System.out.println("Enter Your Password :     ") ;
        String inputUserPassword2 = scanner.nextLine() ;

        System.out.println("Enter Your Password Length :     ") ;
        int inputMinLength2 = scanner.nextInt() ;

        scanner.nextLine() ;
        
        System.out.println("Enter Your New Password :     ") ;
        String inputUserNewPassword2 = scanner.nextLine() ;

        System.out.println("----------result----------");

        User.setMinLength(inputMinLength1) ;

        User userno1 = new User(inputUserName1, inputUserPassword1) ;
        User userno2 = new User(inputUserName2, inputUserPassword2) ;

        User.setMinLength(inputMinLength2) ;

        userno2.setPassword(inputUserNewPassword2) ;

        System.out.println(userno1.getPassword()) ;
        System.out.println(userno2.getPassword()) ;

        scanner.close() ;

    }
}
