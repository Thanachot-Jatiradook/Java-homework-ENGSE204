import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        int number,remainder;
        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        remainder = number % 2;
        if(remainder == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
