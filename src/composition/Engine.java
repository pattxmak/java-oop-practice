package composition;

public class Engine {

    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Engine type cannot be blank");
        }

        if (horsepower <= 0) {
            throw new IllegalArgumentException("Horsepower must be greater than 0");
        }

        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void start() {
        System.out.println("Engine Started (" + type + ", " + horsepower + "HP)");
    }
}
