package inheritance.exercise;

public class VehicleMain {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2023, 4);

        Motorcycle motorcycle1 = new Motorcycle("Honda", "CBR500R", 2024, false);
        Motorcycle motorcycle2 = new Motorcycle("Ural", "Gear Up", 2022, true);

        car.printBasicInfo();
        car.honk();

        System.out.println();
        motorcycle1.printBasicInfo();
        motorcycle1.wheelie();

        System.out.println();
        motorcycle2.printBasicInfo();
        motorcycle2.wheelie();

    }
}
