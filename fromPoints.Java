public class Circle {
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public static Circle fromThreePoints(double x1, double y1, double x2, double y2, double x3, double y3) {
        double d = 2 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if (d == 0) {
            throw new IllegalArgumentException("The points are collinear and do not form a circle.");
        }

        double nx = ((x1 * x1 + y1 * y1) * (y2 - y3) + (x2 * x2 + y2 * y2) * (y3 - y1) + (x3 * x3 + y3 * y3) * (y1 - y2)) / d;
        double ny = ((x1 * x1 + y1 * y1) * (x3 - x2) + (x2 * x2 + y2 * y2) * (x1 - x3) + (x3 * x3 + y3 * y3) * (x2 - x1)) / d;

        double radius = Math.sqrt((nx - x1) * (nx - x1) + (ny - y1) * (ny - y1));

        return new Circle(nx, ny, radius);
    }

    @Override
    public String toString() {
        return "Circle: Center=(" + centerX + ", " + centerY + "), Radius=" + radius;
    }
}
