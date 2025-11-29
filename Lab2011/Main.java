package Lab2011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Car Model :     ") ;
        String inputMcar = scanner.nextLine() ;

        System.out.println("Enter Current Year of Your Car :     ") ;
        int inputYcar = scanner.nextInt() ;

        System.out.println("Enter New Year of Your Car :     ") ;
        int inputNewYear = scanner.nextInt() ;

        Car blehCar = new Car(inputMcar, inputYcar) ;

        blehCar.setYear(inputNewYear) ;

        System.out.println("----------result----------") ;
        System.out.println("Model :     " + blehCar.getModel()) ;
        System.out.println("Year :     " + blehCar.getYear()) ;

        scanner.close();
        
    }
    
}
