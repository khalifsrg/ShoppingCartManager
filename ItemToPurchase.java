public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;


    // no-argument constructor
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    // constructor
    public ItemToPurchase(String name, int price, int quantity) {

        if (name != null) {
            this.itemName = name;
        } else {
            throw new IllegalArgumentException("Name is invalid");
        }

        if (price >= 0) {
            this.itemPrice = price;
        } else {
            throw new IllegalArgumentException("Price is invalid");
        }

        if (quantity >= 1) {
            this.itemQuantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity is invalid");
        }

    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getTotalPrice() {
       return itemPrice * itemQuantity;
    }

    @Override
    public String toString() {
        return itemName + " " +  itemQuantity + " @ $" + itemPrice + " = $" + getTotalPrice();
    }
}

