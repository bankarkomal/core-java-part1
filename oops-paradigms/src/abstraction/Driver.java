package abstraction;

public class Driver {
    public static void main(String[] args) {
        shape circle = new circle(12);

        shape rectangle = new rectangle(10, 15);

        shape square = new square(10);

        circle.draw();
        System.out.println("circle area : " + circle.calculateArea());
        rectangle.draw();
        System.out.println("rectangle area :" + rectangle.calculateArea() );
        square.draw();
        System.out.println("square area : "+ square.calculateArea());

    }
}
