/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author longt
 */
public class Transaction {
    private int value;

    public Transaction(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
}
