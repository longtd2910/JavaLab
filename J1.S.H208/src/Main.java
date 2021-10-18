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

    /**
     * @param args the command line arguments
     */

    
    public static int swapDigitPairs(int input){
        if(input < 10){
            return input;
        }
        int result = 0;
        int pair_index = 0;
        while(input > 10){
            //Take 2 digit pair
            int first = input % 10;
            input /= 10;
            int second = input % 10;
            input /= 10;
            //Add that 2 digit to temp variable
            result = (int) (result + (first * 10 + second) * Math.pow(10, pair_index++));
            ++pair_index;
        }
        result += input * Math.pow(10, pair_index);
        return result;
    }
    public static int intValidate() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        } while (true);
    }

    public static void main(String[] args) {
        int input = intValidate();
        System.out.println(swapDigitPairs(input));
    }

}
