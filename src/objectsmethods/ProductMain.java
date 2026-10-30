package objectsmethods;

import java.util.ArrayList;
import java.util.HashSet;

public class ProductMain {

    public static void main(String[] args) {

        Product product1 = new Product("P001", "Keyboard");
        Product product2 = new Product("P001", "Keyboard V2");

        ArrayList<Product> products = new ArrayList<>();

        products.add(product1);
        System.out.println(products.contains(product2)); // true -->ArrayList.contains() ใช้ equals() ตรวจว่ามีข้อมูลที่เท่ากันหรือไม่  ตอนนี้เราเช็ค productId

        HashSet<Product> uniqueProducts = new HashSet<>(); // using with equals()
        uniqueProducts.add(product1);
        uniqueProducts.add(product2); // do not add --> set

        System.out.println(uniqueProducts.size());
        System.out.println(product1);
    }

}
