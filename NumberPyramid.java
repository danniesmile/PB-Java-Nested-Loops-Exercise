package pavlova;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (count <= n) {
                    System.out.print(count + " ");
                    count++;
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}




