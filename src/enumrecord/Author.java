package enumrecord;

public record Author(String name, String country) {

    public Author {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Author name cannot be blank.");
        }

        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be blank.");
        }
    }

}
