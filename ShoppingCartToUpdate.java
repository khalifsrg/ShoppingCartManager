import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCartToUpdate extends ShoppingCart {

//    public String[] removeItem(String itemName) {
//        String[] newCartItems = new String[cartItems.length-1];
//
//        for (int i = 0; i < newCartItems.length; i++) {
//            newCartItems[i] = cartItems[i];
//        }
//    }

    public void removeItem(String itemName) {
        List<ItemToPurchase> tempCartItems = Arrays.asList(cartItems);
        boolean found = false;

        for (ItemToPurchase itemToPurchase : tempCartItems) {
            if (itemToPurchase.getName().equals(itemName)) {
                tempCartItems.remove(itemToPurchase);
                tempCartItems.toArray(cartItems);
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

}


