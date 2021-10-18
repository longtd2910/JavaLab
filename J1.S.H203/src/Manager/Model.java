/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;


import Object.DiscountBill;
import Object.GroceryBill;

/**
 *
 * @author longt
 */
public class Model {
    GroceryBill groceryBill;
    DiscountBill discountBill;

    public Model(GroceryBill groceryBill, DiscountBill discountBill){
        this.groceryBill = groceryBill;
        this.discountBill = discountBill;
    }
}
