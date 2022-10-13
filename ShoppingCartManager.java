import java.util.Scanner;

public class ShoppingCartManager {
    public static void stage1(ItemToPurchase item){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart Manager.\n\nWould you like to add an item to your shopping cart? yes/no\n");

        String answer = scanner.next();

        while ("yes".equals(answer)) {
            System.out.println("Enter the name of the item:");
            String name = scanner.next();
            System.out.println("Enter the price of " + name + ":");
            int price = scanner.nextInt();
            System.out.println("Enter Quantity:");
            int quantity = scanner.nextInt();
            System.out.println("Would you like to add another item? yes/no");
            answer = scanner.next();

            ItemToPurchase newItem = new ItemToPurchase();
            newItem.setName(name);
            newItem.setPrice(price);
            newItem.setQuantity(quantity);

        }
    }

    public static void stage2(ShoppingCart cart){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to create a new shopping cart? yes/no");

        String cartAnswer = scanner.next();

        while ("yes".equals(cartAnswer)) {

            System.out.println("Enter name of customer:");
            String customerName = scanner.next();
            System.out.println("Enter the current date:");
            String currentDate = scanner.next();

            cart.setCustomerName(customerName);
            cart.setCurrentDate(currentDate);
            cart.printTotal();

            System.out.println("Would you like to add an item to cart? yes/no");
            cartAnswer = scanner.next();

            if (cartAnswer == "no") {
                cart.printTotal();
                break;
            }
                while ("yes".equals(cartAnswer)) {
                System.out.println("Enter name of item:");
                String name = scanner.next();
                System.out.println("Enter price:");
                int price = scanner.nextInt();
                System.out.println("Enter Quantity:");
                int quantity = scanner.nextInt();

                System.out.println("Would you like to add another item to cart? yes/no");
                cartAnswer = scanner.next();

                ItemToPurchase item = new ItemToPurchase();

                item.setName(name);
                item.setPrice(price);
                item.setQuantity(quantity);

                cart.addItem(item);
                cart.printTotal();

            }
        }

    }
    public static void stage3(ShoppingCart cart){

        Scanner scanner = new Scanner(System.in);

        ItemToPurchase item = new ItemToPurchase();
        item.setName("apple");
        item.setPrice(5);
        item.setQuantity(3);
        cart.addItem(item);

        item.setName("orange");
        item.setPrice(5);
        item.setQuantity(3);
        cart.addItem(item);

        item.setName("manggo");
        item.setPrice(5);
        item.setQuantity(3);
        cart.addItem(item);

        item.setName("tomato");
        item.setPrice(5);
        item.setQuantity(3);
        cart.addItem(item);


        ShoppingCartToUpdate shoppingCartToUpdate = new ShoppingCartToUpdate();

        System.out.println("Enter item you would like to remove: ");
        String itemTobeRemoved = scanner.nextLine();

        shoppingCartToUpdate.removeItem(itemTobeRemoved);

        cart.printTotal();


    }
//    public static void stage4(VIPShoppingCart cart){
//
    public static void main(String[] args) {

//        System.out.println("***************Stage 1***************");
//        ItemToPurchase item = new ItemToPurchase();
//        stage1(item);
//
//        System.out.println("***************Stage 2***************");
        ShoppingCart cart = new ShoppingCart();
//        stage2(cart);

        System.out.println("***************Stage 3***************");
        stage3(cart);

//        System.out.println("***************Stage 4***************");
//        VIPShoppingCart vipCart = new VIPShoppingCart();
//        stage4(vipCart);


    }

}