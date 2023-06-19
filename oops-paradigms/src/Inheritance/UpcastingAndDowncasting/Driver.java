package Inheritance.UpcastingAndDowncasting;

public class Driver extends Machine{
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startup();
        machine.shutdown();

        Laptop laptop = new Laptop();
        laptop.startup();
        laptop.doprogramming();
        laptop.shutdown();

        Printer printer = new Printer();
        printer.startup();
        printer.print();
        printer.shutdown();

        /*
        Upcasting-->Upcastingis a create and object of child class and
        assigned to a parent class is a referance variable
        parent class
              |
              |
              |
         child class
         Every laptop will be a machine

         */

        Machine laptop1 = new Laptop();
        laptop1.startup();
        laptop1.shutdown();

        Machine printer1 = new Printer();
        printer1.startup();
        printer1.shutdown();

          /*
        Downcasting-->Downcastingis a create and object of parent class and
        assigned to a childclass is a referance variable
        child class
              |
              |
              |
         parent class
         */
        Laptop laptop2 =(Laptop) new Machine();
        laptop2.startup();
     //   laptop.doprogramming();
        laptop2.shutdown();
    }


}
