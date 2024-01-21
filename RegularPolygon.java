public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        // Test program
        RegularPolygon poly1 = new RegularPolygon();  // Default constructor
        RegularPolygon poly2 = new RegularPolygon(6, 4);  // Constructor with specified sides and length
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);  // Constructor with specified sides, length, and coordinates

        // Display perimeter and area for each object
        System.out.println("Polygon 1 - Perimeter: " + poly1.getPerimeter() + ", Area: " + poly1.getArea());
        System.out.println("Polygon 2 - Perimeter: " + poly2.getPerimeter() + ", Area: " + poly2.getArea());
        System.out.println("Polygon 3 - Perimeter: " + poly3.getPerimeter() + ", Area: " + poly3.getArea());
    }
}
