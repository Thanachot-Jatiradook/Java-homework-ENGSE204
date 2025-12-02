package Lab302;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Score :     ");
        int inputFirstInitialscore = scanner.nextInt();

        System.out.println("Enter Your Second Score :     ");
        int inputSecondInitialscore = scanner.nextInt();

        Player pScore = new Player(inputFirstInitialscore);

        pScore.setScore(inputSecondInitialscore);

        System.out.println("---------result----------");
        System.out.println(pScore.getScore());

        scanner.close();
    }
}
