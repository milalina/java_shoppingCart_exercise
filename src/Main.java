import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product p4 = new Product("pencil", 3);
        Product p5 = new Product("pencil", 3);
        Product p6 = new Product("pencil", 3);
        Product p7 = new Product("bike", 300);
        System.out.println(p1);

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.fillShoppingCart(p1);
        shoppingCart.fillShoppingCart(p2);
        shoppingCart.fillShoppingCart(p3);
        shoppingCart.fillShoppingCart(p4);
        shoppingCart.fillShoppingCart(p5);
        shoppingCart.fillShoppingCart(p6);
        shoppingCart.fillShoppingCart(p7);

        System.out.println(shoppingCart.formattedTotalPrice());
        System.out.println("Products in the cart are "+ shoppingCart.getProducts());
    }
}
