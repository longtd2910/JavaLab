/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.DiscountBill;
import Object.Employee;
import Object.GroceryBill;
import Object.Item;
import Util.Function;
import Util.ItemQuantityTuple;
import Util.LocalException;

/**
 *
 * @author longt
 */
public class Controller {
    View view = new View();
    Model model = new Model(new GroceryBill(new Employee()), new DiscountBill(new Employee(), true));

    public void produceTest(){
    }

    public void programLoop() {
        produceTest();
        do {
            view.displayMenu();
            int functionChoice;
            do {
                try {
                    functionChoice = Function.checkInteger(view.takeMenuInput(), 0, 8);
                    break;
                } catch (LocalException e) {
                    view.displayCustomMessage(e.getMessage());
                }
            } while (true);
            switch (functionChoice) {
                case 0:
                    return;
                case 1:
                    this.addItemView();
                    break;
                case 2:
                    model.discountBill.printReceipt();
                    break;
                case 3:
                    view.billTotal(false, model.groceryBill.getTotal());
                    break;
                case 4:
                    view.billTotal(true, model.discountBill.getTotal());
                    break;
                case 5:
                    view.discountedCount(model.discountBill.getDiscountCount());
                    break;
                case 6:
                    view.discountFactor(false, model.discountBill.getDiscountAmount());
                    break;
                case 7:
                    view.discountFactor(true, model.discountBill.getDiscountPercent());
                    break;
                case 8:
                    model.discountBill.setPreferred(!model.discountBill.isPreferred());
                    view.changePreference(model.discountBill.isPreferred());
                    break;
            }
        } while (true);
    }

    private void addItemView() {
        try{
            ItemQuantityTuple tuple = Function.checkItem(view.addItem());
            addItemModel(tuple.getItem(), tuple.getQuantity());
        }
        catch(LocalException e){
            view.displayCustomMessage(e.getMessage());
        }
    }

    private void addItemModel(Item item, int quantity){
        model.discountBill.add(item, quantity);
        model.groceryBill.add(item, quantity);
    }
}
