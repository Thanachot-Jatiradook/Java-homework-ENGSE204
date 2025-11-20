import java.util.Scanner;

public class Lab109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int range = scanner.nextInt();
        int[] numbers = new int[range];
        int sum = 0;
        System.out.println("Enter " + range + " numbers:");
        for (int i = 0; i < range; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / range;
        System.out.println(average);
        scanner.close();
    }
}
