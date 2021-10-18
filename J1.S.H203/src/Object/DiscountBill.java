/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author longt
 */
public class DiscountBill extends GroceryBill {
    private boolean preferred;

    public boolean isPreferred() {
        return preferred;
    }

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }

    public void setPreferred(boolean preferred){
        this.preferred = preferred;
    }

    @Override
    public double getTotal() {
        double sum = 0;
        if (!preferred) {
            return super.getTotal();
        }
        for (int i = 0; i < itemList.size(); ++i) {
            sum += (itemList.get(i).getPrice() - itemList.get(i).getDiscount()) * itemQuantity.get(i);
        }
        return sum;
    }

    public int getDiscountCount(){
        if(!preferred){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < itemList.size(); ++i){
            if(itemList.get(i).getDiscount() > 0){
                count += itemQuantity.get(i);
            }
        }
        return count;
    }

    public double getDiscountAmount(){
        double sum = 0;
        if (!preferred) {
            return 0;
        }
        for (int i = 0; i < itemList.size(); ++i) {
            sum += itemList.get(i).getDiscount() * itemQuantity.get(i);
        }
        return sum;
    }

    public double getDiscountPercent(){
        return getTotal() / super.getTotal() * 100;
    }
}
