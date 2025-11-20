import java.util.Scanner;

public class Lab108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int range = scanner.nextInt();
        int[] numbers = new int[range];
        System.out.println("Enter " + range + " numbers:");
        for (int i = 0; i < range; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0]; 
        for (int i = 1; i < range; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum value is: " + max);
        scanner.close();
    }
}