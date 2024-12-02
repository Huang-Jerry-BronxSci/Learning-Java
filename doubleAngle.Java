public class doubleAngle {

    public class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double calculateAngle() {
            double angleInRadians = Math.atan2(y, x);
            double angleInDegrees = Math.toDegrees(angleInRadians);
            if (angleInDegrees < 0) {
                angleInDegrees += 360;
            }
            return angleInDegrees;
        }
    }
}


        
       