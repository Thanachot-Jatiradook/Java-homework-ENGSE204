package Lab307;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Id :     ") ;
        String inputEmployeeId = scanner.nextLine() ;

        System.out.println("Enter Your Old Department :     ") ;
        String inputOldDepartment = scanner.nextLine() ;

        System.out.println("Enter Your New Department :     ") ;
        String inputNewDepartment = scanner.nextLine() ;

        Employee blehEmployee = new Employee(inputEmployeeId, inputOldDepartment) ;

        blehEmployee.setDepartment(inputNewDepartment) ;
        
        System.out.println("----------result----------");
        System.out.println(blehEmployee.getEmployeeId()) ;
        System.out.println(blehEmployee.getDepartment()) ;

        scanner.close() ;

    }
}
