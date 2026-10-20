package methodoverloading;

public class VehicleMain {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2023, 4);
        car.printBasicInfo();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2024, false);
        motorcycle.printBasicInfo();

    }
}
