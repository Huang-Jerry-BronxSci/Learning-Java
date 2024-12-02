public class RightTriangle implements Shape {
    private double base;
    private double height;
    private double cornerX;
    private double cornerY;

    public RightTriangle(double base, double height, double cornerX, double cornerY) {
        this.base = base;
        this.height = height;
        this.cornerX = cornerX;
        this.cornerY = cornerY;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public boolean contains(double x, double y) {
        double dx = x - cornerX;
        double dy = y - cornerY;

        if (dx < 0 || dy < 0 || dx > base || dy > height) {
            return false;
        }

        return dx * height + dy * base <= base * height;
    }

    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        double ratio1 = t1.base / t1.height;
        double ratio2 = t2.base / t2.height;
        return Double.compare(ratio1, ratio2) == 0;
    }

    @Override
    public String toString() {
        return "RightTriangle: Base=" + base + ", Height=" + height + ", Corner=(" + cornerX + ", " + cornerY + ")";
    }
}
