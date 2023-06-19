package Inheritance.UpcastingAndDowncasting;
/*
Object--> Object is a blue print few of single can create object
 */
public class Machine {
    public void startup(){
        System.out.println(this.getClass().getName()+"Machine is starting up");

    }
    public void shutdown(){
        System.out.println("machine is shutdown");
    }

}
