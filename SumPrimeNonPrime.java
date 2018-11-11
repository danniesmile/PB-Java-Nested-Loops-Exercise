package pavlova;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNot = 0;
        while (!"stop".equals(input)) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;
                if (num >= 2) {
                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                        }
                    }
                } else {
                    isPrime = false;
                }
                if (isPrime) sumPrime += num;
                else sumNot += num;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNot);
    }
}
