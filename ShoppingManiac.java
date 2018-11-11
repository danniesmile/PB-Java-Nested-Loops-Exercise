package pavlova;

import java.util.Scanner;

public class ShoppingManiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String input;
        int spend = 0;
        int clothes = 0;
        boolean isEnter = false;
        boolean isEnough = false;
        while (!isEnough) {
            switch (input = scanner.nextLine()) {
                case "enter":
                    isEnter = true;
                    break;
                case "leave":
                    isEnter = false;
                    break;
                case "enough":
                    isEnough = true;
                    break;
                default:
                    if (isEnter) {
                        int price = Integer.parseInt(input);
                        if ((price + spend) > budget) {
                            System.out.println("Not enough money.");
                        } else {
                            spend += price;
                            clothes++;
                        }
                    }
                    if (spend == budget) isEnough = true;
                    break;
            }
        }
        System.out.printf("For %d clothes I spent %d lv and have %d lv left.", clothes, spend, budget - spend);
    }
}
