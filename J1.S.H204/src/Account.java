import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author longt
 */
public class Account {
    private Client client;
    private int balance;
    protected ArrayList<Transaction> transList = new ArrayList<>();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(Client client, int balance){
        this.client = client;
        this.balance = balance;
    }

    public boolean process(Transaction t){
        transList.add(t);
        if (balance + t.value() < 0){
            return false;
        }
        else{
            this.balance += t.value();
            return true;
        }
    }
}
