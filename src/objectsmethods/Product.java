package objectsmethods;

public class Product {

    private final String productId;
    private final String name;

    public Product(String productId, String name) {

        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be blank.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }

        this.productId = productId;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{productId='" + productId + "', name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product other =  (Product) obj;

        return productId.equals(other.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}
