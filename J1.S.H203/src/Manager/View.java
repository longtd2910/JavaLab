/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Scanner;

/**
 *
 * @author longt
 */
public class View {
    private Scanner scanner = new Scanner(System.in);

    public View(){};

    public void displayMenu(){
        System.out.println("Grocery Bill");
        System.out.println("1. Add an item to your bill");
        System.out.println("2. Display current bill");
        System.out.println("3. Calculate total price of normal bill");
        System.out.println("4. Calculate total price of discounted bill");
        System.out.println("5. Count the number of discounted items");
        System.out.println("6. Calculate total discounted amount");
        System.out.println("7. Calculate discounted percent");
        System.out.println("8. Switch customer type");
        System.out.println("0. Exit");
    }

    public void displayCustomMessage(String message){
        System.out.println(message);
    }
    public String takeMenuInput(){
        System.out.println("Enter a number (0-8):");
        return scanner.nextLine();
    }

    public String addItem(){
        System.out.println("Enter a new item, properties are separated by vertical bar (Item Name | Price | Discount Amount | Quantity): ");
        return scanner.nextLine();
    }
    
    public void billTotal(boolean isDiscounted, double price){
        System.out.format("Total price of %s bill: %f\n", !isDiscounted ? "normal" : "discount" , price);
    }

    public void discountedCount(int count){
        System.out.format("%d item(s) were discounted\n", count);
    }

    public void discountFactor(boolean isPercent, double amount){
        System.out.format("Your bill was discounted by %.2f%s\n",amount, isPercent ? "%" : "$");
    }

    public void changePreference(boolean isPreferred){
        System.out.format("Customer is now %s preferred ( %s get discount )\n", isPreferred ? "" : "not", isPreferred ? "Can" : "Can not");
    }
}
