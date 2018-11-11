package pavlova;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                num = row + col + 1;
                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

