package polymorphism;

public class Dog extends Animal {
    @Override
    void Walk() {
        System.out.println(" dog is walking");


    }

    @Override
    void Run() {
        System.out.println(" dog is running");

    }
}