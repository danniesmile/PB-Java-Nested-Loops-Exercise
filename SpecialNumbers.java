package pavlova;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 0;
        int num, num0, num1, num2, num3;
        for (int i = 1111; i <= 9999; i++) {
            num = i;
            num3 = num % 10;
            num /= 10;
            num2 = num % 10;
            num /= 10;
            num1 = num % 10;
            num /= 10;
            num0 = num % 10;
            if (num0 != 0 && num1 != 0 && num2 != 0 && num3 != 0) {
                if (n % num0 == 0 && n % num1 == 0 && n % num2 == 0 && n % num3 == 0) {
                    if (cnt++ > 0) System.out.print(" ");
                    System.out.print(i);
                }
            }
        }
    }
}
