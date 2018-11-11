package com.company;

import java.util.Scanner;

public class EqualSumsLeftRightPositions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstNum = in.nextLine();
        String secondNum = in.nextLine();

        int fNum = Integer.parseInt(firstNum);
        int sNum = Integer.parseInt(secondNum);

        int leftSum = 0;
        int midSum = 0;
        int rightSum = 0;

        for (int i = fNum; i <= sNum; i++) {
            String currentNumber = Integer.toString(i);
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 1) {
                    char symbol = currentNumber.charAt(j);
                    int num = Character.getNumericValue(symbol);
                    leftSum += num;
                } else if (j == 3 || j == 4) {
                    char symbol = currentNumber.charAt(j);
                    int num = Character.getNumericValue(symbol);
                    rightSum += num;
                } else {
                    char symbol = currentNumber.charAt(j);
                    int num = Character.getNumericValue(symbol);
                    midSum += num;
                }
            }
            if (leftSum == rightSum) {
                System.out.print(currentNumber + " ");
            } else {
                if (leftSum < rightSum) {
                    leftSum += midSum;
                    if (leftSum == rightSum) {
                        System.out.print(currentNumber + " ");
                    }
                } else if (rightSum < leftSum) {
                    rightSum += midSum;
                    if (rightSum == leftSum) {
                        System.out.print(currentNumber + " ");
                    }
                }
            }

            leftSum = 0;
            midSum = 0;
            rightSum = 0;
        }
    }
}