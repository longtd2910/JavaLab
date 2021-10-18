import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author longt
 */
public class Main {

    public static int inputValidate(String message, int lowerLimit, int upperLimit) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        do {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result >= lowerLimit && result <= upperLimit) {
                    return result;
                }
                System.out.printf("Input out of valid range %d - %d\n", lowerLimit, upperLimit);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
            System.out.println("Please enter again");
        } while (true);
    }


    public static void printReverse(int min, int max) {
        int len = max - min + 1;

        for (int j = min; j <= max; j++) {
            int k = j;
            for (int i = 0; i < len; i++) {
                if (k > max) {
                    k = min;
                }
                System.out.printf("%3d", k);
                k++;
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        //int[] input = inputValidate();
        int min = inputValidate("Input min value: ", Integer.MIN_VALUE, Integer.MAX_VALUE - 1);
        int max = inputValidate("Input max value:", min, Integer.MAX_VALUE);
        printReverse(min, max);
    }

}
