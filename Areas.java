import java.util.Scanner;

class InputScanner {
    Scanner s = new Scanner(System.in);

    int getInput(String prompt) {
        System.out.println(prompt);
        return s.nextInt();
    }
}

class shape extends InputScanner {
    double dim1;
    double dim2;

    shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
}

class Rectangle extends shape {
    Rectangle() {
        super(0, 0);
        dim1 = getInput("Enter length");
        dim2 = getInput("Enter breadth");
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends shape {
    Triangle() {
        super(0, 0);
        dim1 = getInput("Enter length");
        dim2 = getInput("Enter base");
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class Circle extends shape {
    Circle() {
        super(0, 0);
        dim1 = getInput("Enter the radius");
        dim2 = dim1; 
    }

    double area() {
        System.out.println("Inside Area for Circle.");
        return Math.PI * dim1 * dim2;
    }
}

public class Areas {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of Rectangle: " + rectangle.area());

        Triangle triangle = new Triangle();
        System.out.println("Area of Triangle: " + triangle.area());

        Circle circle = new Circle();
        System.out.println("Area of Circle: " + circle.area());
    }
}