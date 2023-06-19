package Inheritance.UpcastingAndDowncasting;

public class Laptop extends Machine {
    public void doprogramming(){
        System.out.println(this.getClass().getName()+"I'm  trying to learn doprogramming");
    }
}
