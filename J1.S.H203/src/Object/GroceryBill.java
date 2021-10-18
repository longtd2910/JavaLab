package Object;

import java.util.ArrayList;

public class GroceryBill {
    protected ArrayList<Item> itemList = new ArrayList<Item>();
    protected ArrayList<Integer> itemQuantity = new ArrayList<Integer>();
    protected Employee clerk;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }

    public void add(Item i) {
        itemList.add(i);
        itemQuantity.add(1);
        System.out.format("Item (%s | %f | %f | %d) added\n", i.getName(), i.getPrice(), i.getDiscount(), 1);
    }

    public void add(Item i, int quantity) {
        itemList.add(i);
        itemQuantity.add(quantity);

        System.out.format("Item (%s | %f | %f | %d) added\n", i.getName(), i.getPrice(), i.getDiscount(), quantity);
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < itemList.size(); ++i) {
            sum += itemList.get(i).getPrice() * itemQuantity.get(i);
        }
        return sum;
    }

    public void printReceipt() {
        int maxNameLength = 12;
        for (Item item : itemList) {
            if (maxNameLength < item.getName().length()) {
                while (maxNameLength < item.getName().length()) {
                    maxNameLength += 4;
                }
            }
        }
        System.out.println(maxNameLength);
        String labelSpan = "";
        String breakLineSpan = "";
        String endLineSpan = "";
        for (int i = 11; i <= maxNameLength; ++i) {
            labelSpan += " ";
            breakLineSpan += "-";
            endLineSpan += "_";
        }
        System.out.println("| Item Name  " + labelSpan + "| Quantity | Price |");
        System.out.println("|------------" + breakLineSpan + "+----------+-------|");
        for (int i = 0; i < itemList.size(); ++i) {
            String nameSpaces = "";
            for (int j = itemList.get(i).getName().length(); j <= maxNameLength; ++j) {
                nameSpaces += " ";
            }
            System.out.format("| %s|%10d|%7.2f|\n", itemList.get(i).getName() + nameSpaces, itemQuantity.get(i),
                    itemList.get(i).getPrice());
        }
        System.out.println("|____________" + endLineSpan + "|__________|_______|");
    }
}
