package basicoop;

public class Product {

    // field or instance variable
    String name;
    double price;


    Product() { }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    // method
    void printInfo() {
        System.out.println(name + " - " + price + " bath");
    }

    double getPriceWithVat() {
        return price * 1.07;
    }

}
