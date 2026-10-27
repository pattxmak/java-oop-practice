package composition;

public class CarMain {

    public static void main(String[] args) {

        // 1. Create Engine
        Engine v6Engine = new Engine("V6", 300);

        // 2. Create Car --> send engine to create
        Car myCar = new Car("Toyota", "Camry", v6Engine);

        myCar.printInfo();
        System.out.println( );
        myCar.startCar();

    }
}
