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
public class Function {
    public static boolean checkString(String input, String regex, boolean mustTrim, boolean allowEmpty)
            throws LocalException {
        // Check for spaces trying to illegally bypass empty check
        input = mustTrim ? input.trim() : input;

        if (input.isEmpty() && allowEmpty == false) {
            throw new LocalException("String is not allowed to be empty");
        }
        // if string matches requirement break out of input loop
        if (input.matches(regex)) {
            return true;
        }
        throw new LocalException("String doesn't match requirement");
    }

    public static int checkInteger(String inputStr, int lowerEqualLimit, int upperEqualLimit) throws LocalException {
        try {
            int input = Integer.parseInt(inputStr.trim());
            if (lowerEqualLimit <= input && upperEqualLimit >= input) {
                return input;
            } else {
                throw new LocalException(
                        String.format("Input out of valid range (%d - %d)", lowerEqualLimit, upperEqualLimit));
            }
        } catch (Exception e) {
            throw new LocalException("Invalid input. Please enter a valid number");
        }
    }

    public static boolean checkDouble(String inputStr, int lowerEqualLimit, int upperEqualLimit) throws LocalException {
        try {
            double input = Double.parseDouble(inputStr.trim());
            if (lowerEqualLimit <= input && upperEqualLimit >= input) {
                return true;
            } else {
                throw new LocalException(
                        String.format("Input out of valid range (%d - %d)", lowerEqualLimit, upperEqualLimit));
            }
        } catch (Exception e) {
            throw new LocalException("Invalid input. Please enter a valid number");
        }
    }

    public static ItemQuantityTuple checkItem(String input) throws LocalException {
        Item item;
        int quantity;
        try {
            String[] properties = input.split("\\|");
            double price = Double.parseDouble(properties[1].trim());
            double discount = Double.parseDouble(properties[2].trim());
            quantity = Integer.parseInt(properties[3].trim());
            item = new Item(properties[0].trim(), price, discount);
        } catch (Exception e) {
            throw new LocalException("Invalid input. Item was not added");
        }
        return new ItemQuantityTuple(item, quantity);
    }
}
