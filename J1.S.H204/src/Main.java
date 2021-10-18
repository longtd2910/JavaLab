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
    public static int checkInteger(String inputStr, int lowerEqualLimit, int upperEqualLimit) {
        do{
            System.out.println(inputStr);
            Scanner sc = new Scanner(System.in);
            try{
                int output = Integer.parseInt(sc.nextLine());
                if(lowerEqualLimit <= output && upperEqualLimit >= output){
                    return output;
                }
            }
            catch (Exception e){
                System.out.println("Invalid input");
            }
        }while(true);
    }

    public static void displayMenu() {
        System.out.println("Cash processing company:");
        System.out.println("1. Process new transaction");
        System.out.println("2. Print balance");
        System.out.println("3. Print filtered percentage");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Client client = new Client();
        FilteredAccount filteredAccount = new FilteredAccount(client, 100);
        filteredAccount.process(new Transaction(124));
        filteredAccount.process(new Transaction(0));
        filteredAccount.process(new Transaction(14));
        filteredAccount.process(new Transaction(0));
        filteredAccount.process(new Transaction(35));
        filteredAccount.process(new Transaction(23));
        filteredAccount.process(new Transaction(53));
        filteredAccount.process(new Transaction(-25));
        filteredAccount.process(new Transaction(-124));
        filteredAccount.process(new Transaction(764));
        filteredAccount.process(new Transaction(-33));
        int choice = 0;
        while (true) {
            displayMenu();
            choice = checkInteger("Your choice (0-3): ", 0, 3);
            switch(choice){
                case 0:
                    return;
                case 1:
                    filteredAccount.process(new Transaction(checkInteger("Enter transaction value:", Integer.MIN_VALUE, Integer.MAX_VALUE)));
                    break;
                case 2:
                    System.out.println(filteredAccount.getBalance());
                    break;
                case 3:
                    System.out.println(filteredAccount.percentFiltered() + "%");
                    break;
            }
        }
    }
}
