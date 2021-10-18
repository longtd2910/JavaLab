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

    public static int secondHalfLetters(String input){
        int result = 0;
        input = input.toLowerCase();
        for(int i = 0; i < input.length(); ++i){
            if (input.charAt(i) >= 'n' && input.charAt(i) <= 'z'){
                ++result;
            }
        }
        return result;
    }

    public static String stringValidate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to analyze");
        do {
            String result = sc.nextLine();
            result = result.replaceAll("\\s+", "");
            if (!result.isEmpty()) {
                return result;
            }
            System.out.println("Input must contain some content");
        } while (true);
    }

    public static void main(String[] args) {
        String input = stringValidate();
        System.out.println(secondHalfLetters(input));
    }

}
