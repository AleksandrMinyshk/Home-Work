package HomeWork.HWclass26;

public class Square implements Shape{
    // Square.java

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
}


