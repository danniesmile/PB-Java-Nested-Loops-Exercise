package pavlova;

import java.util.Scanner;

public class PartyInvitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int countValid = 0;
        int countNot = 0;
        while (!(input = scanner.nextLine()).equals("Statistic")) {
            input = input.toLowerCase();
            boolean isValid = true;
            for (int i = 0; i < input.length(); i++) {
                int c = input.charAt(i);
                if (c < 97 || c > 122) isValid = false;
            }
            if (isValid) {
                System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
                countValid++;
            } else {
                System.out.println("Invalid name!");
                countNot++;
            }
        }
        int count = countNot + countValid;
        System.out.printf("Valid names are %.2f%% from %d names.%n", (double) countValid / count * 100, count);
        System.out.printf("Invalid names are %.2f%% from %d names.", (double) countNot / count * 100, count);
    }
}