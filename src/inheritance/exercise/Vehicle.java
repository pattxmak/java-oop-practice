package inheritance.exercise;

public class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {

        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand cannot be blank");
        }

        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be blank");
        }

        if (year < 1886 || year > 2100) {
            throw new IllegalArgumentException("Year must between 1886 and 2100");
        }

        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void printBasicInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
