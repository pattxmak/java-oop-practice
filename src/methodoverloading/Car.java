package methodoverloading;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);

        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be greater than 0");
        }

        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Car horn: Beep beep!");
    }


    @Override
    public void printBasicInfo() {
        super.printBasicInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
