package inheritance.exercise;

public class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);

        this.hasSidecar = hasSidecar;
    }


    public void wheelie(){
        if (hasSidecar) {
            System.out.println("Cannot do a wheelie with a sidecar.");
            return;
        }

        System.out.println("Motorcycle is doing a wheelie!");

    }
}
