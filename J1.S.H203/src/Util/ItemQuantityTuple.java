/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Object.Item;

/**
 *
 * @author longt
 */
public class ItemQuantityTuple {
    private Item item;
    private int quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ItemQuantityTuple(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    
}
