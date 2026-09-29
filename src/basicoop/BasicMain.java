package basicoop;

public class BasicMain {
    public static void main(String[] args) {

        // Create object using new keyword
        Product coffee = new Product();
        coffee.name = "Black honey coffee";
        coffee.price = 100;

        Product cake = new Product();
        cake.name = "Strawberry Cake";
        cake.price = 150;

        System.out.println("Output from sout");
        System.out.println(coffee.name);
        System.out.println(coffee.price);

        System.out.println("\n" + cake.name);
        System.out.println(cake.price);

        System.out.println("Output from method");
        coffee.printInfo();
        System.out.println("Total price with VAT: " + coffee.getPriceWithVat());

        cake.printInfo();
        System.out.println("Total price with VAT: " + cake.getPriceWithVat());

        // Using constructor
        Product tea = new Product("Green tea", 120);
        Product soda = new Product("Lemon Soda", 70);

        tea.printInfo();
        soda.printInfo();

    }
}
