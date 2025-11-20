import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {

        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number 1:");
        num1 = input.nextDouble();
        System.out.println("Enter the Number 2:");
        num2 = input.nextDouble();
        input.close();

        Double result = num1 * num2;

        System.out.println(result);
    }
}