package abstraction;


public class square implements shape{
    float side;

    public square(float side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(" I'm drawing a square");

    }

    @Override
    public double calculateArea() {
        return 0;
    }


}