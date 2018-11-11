package pavlova;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int num1 = a; num1 <= b; num1++) {
            for (int num2 = a; num2 <= b; num2++) {
                for (int num3 = c; num3 <= d; num3++) {
                    for (int num4 = c; num4 <= d; num4++) {
                        if (num1 != num2 && num3 != num4 && num1 + num4 == num2 + num3) {
                            System.out.println("" + num1 + num2 + "\n" + num3 + num4 + "\n");
                        }
                    }
                }
            }
        }
    }
}
