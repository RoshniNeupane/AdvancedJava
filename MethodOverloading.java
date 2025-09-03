//WAP to program to demonstrate method overloading (eg. calculate the area of circle ,rectangle and triangle).

class MethodOverloading {
    // Method to calculate area of circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of triangle
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1; 
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Area of Circle: " + obj.area(5));
        System.out.println("Area of Rectangle: " + obj.area(5, 10));
        System.out.println("Area of Triangle: " + obj.area(5, 10, true));
    }
}