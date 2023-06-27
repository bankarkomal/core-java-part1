package abstraction;

public class circle implements shape{
    float radius;

    public circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I' m drawing a circle");
    }

    @Override
    public double calculateArea(){
        return 3.14*radius*radius;

    }
}
