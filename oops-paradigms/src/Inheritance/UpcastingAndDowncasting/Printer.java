package Inheritance.UpcastingAndDowncasting;

public class Printer extends Machine{
    public void print(){
        System.out.println(this.getClass().getName()+"Printer print the document");
    }
}
