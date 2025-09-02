public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0; // Default implementation
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Generic Shape of color " + color;
    }
}
