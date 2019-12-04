import java.text.NumberFormat;
import java.util.*;

public class ShoppingCart {

    private double totalPrice;

    private String formattedPrice;

    List<Product> products=new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ShoppingCart() {
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> fillShoppingCart(Product product){
        products.add(product);
        return products;
    }

    /*public Map<String, Integer> howManySameProducts(){
        List<String> productNamesList =new ArrayList<>();
        for(Product product: products){
            productNamesList.add(product.getName());
        }
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : productNamesList) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
        System.out.println(hm);
        return hm;
         String productInThreePlusQuantity;
      for (Map.Entry<String, Integer> val : howManySameProducts().entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
    }*/

   /* List<Product> makeListEveryFourthItemSameProductCostsZero(){
        List<Product> everyFourthItemSameProductCostsZero= new ArrayList<>();

        return EveryFourthItemSameProductCostsZero;
    }*/

    public double calculateTotalPrice(){

        for(Product product: products){
            totalPrice+=product.getPrice();
        }
        if(products.size()>=5){
            totalPrice=totalPrice*0.9;
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

    public String formattedTotalPrice(){
        this.calculateTotalPrice();
        NumberFormat formatter =
                NumberFormat.getCurrencyInstance();
        formattedPrice=formatter.format(totalPrice);
        return formattedPrice;
    }

}
