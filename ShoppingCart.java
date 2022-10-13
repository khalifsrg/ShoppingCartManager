public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private static final int CAPACITY = 10;
    ItemToPurchase[] cartItems;
    private int itemCount;

    public ShoppingCart() {
        this.customerName = "Unknown";
        this.currentDate = "1 September 2022";
        cartItems = new ItemToPurchase[CAPACITY];
        this.itemCount = 0;

        for (int i = 0; i < cartItems.length; i++) {
            ItemToPurchase item = new ItemToPurchase();
            cartItems[i] = item;
        }
    }

    public ShoppingCart(String name, String date) {
        this.customerName = name;
        this.currentDate = date;
        cartItems = new ItemToPurchase[CAPACITY];
        this.itemCount = 0;

        for (int i = 0; i < cartItems.length; i++) {
            ItemToPurchase item = new ItemToPurchase();
            cartItems[i] = item;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public boolean addItem(ItemToPurchase newItem) {
        for (ItemToPurchase item : cartItems) {
            if (item.getName().equals(newItem.getName())) {
                System.out.println("ITEM ALREADY EXISTS");
                return false;
            } else if (item.getName().equals("none")) {
                item.setName(newItem.getName());
                item.setPrice(newItem.getPrice());
                item.setQuantity(newItem.getQuantity());
                return true;
            }
        }
        System.out.println("SHOPPING CART IS FULL");
        return false;
    }

    public int getNumItemsInCart() {
        int totalQuantity = 0;
        for (ItemToPurchase itemToPurchase : cartItems) {
            totalQuantity += (itemToPurchase.getTotalPrice());
        }
        return totalQuantity;
    }

    public int getCostOfCart() {
        int totalCost = 0;
        for (ItemToPurchase itemToPurchase : cartItems) {
            totalCost += (itemToPurchase.getTotalPrice());
        }
        return totalCost;
    }

    public void printTotal() {
        if (getNumItemsInCart() == 0) {
            System.out.println("SHOPPING CART IS EMPTY.");
            return;
        }
        System.out.println(customerName + "\'s" + " Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());

        for (ItemToPurchase itemToPurchase : cartItems) {
            itemToPurchase.getPrice();
        }
        System.out.println("Total: $" + getCostOfCart());
    }
}
