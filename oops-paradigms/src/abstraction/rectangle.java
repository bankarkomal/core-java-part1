package abstraction;

public class rectangle implements shape{
    float length;
    float breadth;

    public rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a rectangle");


    }

    @Override
    public double calculateArea() {
        return 0;

    }
}
