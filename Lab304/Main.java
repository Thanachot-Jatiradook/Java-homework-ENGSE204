package Lab304;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("How many product that you want to make :     ") ;
        int n = scanner.nextInt() ;

        scanner.nextLine() ;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Your Product Name :     ") ;
            String productName = scanner.nextLine() ;

            new Product(productName) ;
        }

        System.out.println("----------result----------") ;
        System.out.println(Product.getProductCount()) ;

        scanner.close() ;
    }
    
}
