import java.util.Scanner;

public class Lab1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Rows (R): ");
        int R = scanner.nextInt();

        System.out.print("Enter Columns (C): ");
        int C = scanner.nextInt();

        int[][] serverGrid = new int[R][C];

        System.out.println("Enter grid data (" + (R*C) + " numbers, 0 or 1):");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                serverGrid[i][j] = scanner.nextInt();
            }
        }

        int onlineCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (serverGrid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }

        System.out.println("Total Online Servers: " + onlineCount);

        scanner.close();
    }
}