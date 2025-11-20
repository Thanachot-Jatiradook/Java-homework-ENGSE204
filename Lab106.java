import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = scanner.nextInt();
        for (int x=1;x<=12;x++){
            System.out.println(number+" x "+x+" = "+(number*x));
        }
    }
}
