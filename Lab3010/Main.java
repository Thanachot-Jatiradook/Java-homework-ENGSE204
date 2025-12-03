package Lab3010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                String command = scanner.next();

                if (command.equals("SET")) {
                    int level = scanner.nextInt();
                    SystemLogger.setLogLevel(level);
                }
                else if (command.equals("LOG")) {
                    int level = scanner.nextInt();

                    String message = scanner.nextLine().trim();

                    if (message.isEmpty()){
                        message = scanner.nextLine().trim();
                    }
                    SystemLogger.log(level, message);
                }
            }
        }

        scanner.close();

    }
}
