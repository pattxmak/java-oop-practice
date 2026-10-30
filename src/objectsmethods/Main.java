package objectsmethods;

public class Main {


    public static void main(String[] args) {

        Product product = new Product("P001", "Keyboard");
        // packageName.className + @ + Hashcode(Hex) // ไม่ใช่ที่อยู่หน่อยความจำ
        // Call method toString
        System.out.println(product); // objectsmethods.Product@7adf9f5f

        // Product{productId='P001', name='Keyboard'}
        // Override version
        System.out.println(product);


        // without Override version
        Product product1 = new Product("P001", "Keyboard");
        Product product2 = new Product("P002", "Keyboard");
        Product product3 = product1;

        System.out.println(product1 == product2); // false
        System.out.println(product1 == product3); // true

        System.out.println(product1.equals(product2)); // false


        // Override
        System.out.println();
        Product product4 = new Product("P001", "Keyboard");
        Product product5 = new Product("P001", "Keyboard V2");
        Product product6 = new Product("P002", "Mouse");

        System.out.println(product4.equals(product5)); // true
        System.out.println(product4.equals(product6)); // false
        System.out.println(product4.equals(null));     // false


    }
}
