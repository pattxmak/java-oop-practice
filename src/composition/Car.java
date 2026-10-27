package composition;

public class Car {

    private String brand;
    private String model;
    private Engine engine; // Car has a Engine

    public Car(String brand, String model, Engine engine) {

        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand type cannot be blank");
        }

        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model type cannot be blank");
        }

        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }

        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting " + brand + " " + model);
        engine.start();
    }

    public void printInfo() {
        System.out.println("Car " + brand + " " + model);
        System.out.println("Engine type: " + engine.getType());
        System.out.println("Horsepower: " + engine.getHorsepower());
    }
}
