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

    public static String getReversedString(String input){
        String result = "";
        for(int i = input.length() - 1; i > -1; --i){
            result+= String.valueOf(input.charAt(i));
        }
        return result;
    }
    public static void printReverse(String input){
        System.out.println(getReversedString(input));
    }
    
    public static void main(String[] args) {
        System.out.println("Input a string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(!input.isEmpty()){
            printReverse(input);
        }
    }
    
}
