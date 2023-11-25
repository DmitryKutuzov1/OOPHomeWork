import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("tea", 50, 200, 90));
        productList.add(new HotDrink("coffee", 70, 150, 100));
        productList.add(new HotDrink("coffee", 80, 200, 110));
        productList.add(new HotDrink("chocolate", 95, 250, 150));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        
        System.out.println(vendingMachine.getProduct("tea"));
        System.out.println(vendingMachine.getProduct("coffee", 150, 100));
        System.out.println(vendingMachine.getProduct("coffee", 200, 110));
        System.out.println(vendingMachine.getProduct("chocolate", 250, 150));
    }
}
