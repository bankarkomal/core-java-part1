package polymorphism;
/*
Many form of single items/thing
Polymorphism-->A single method can have many form
There ar two type:-
1 Static polymorphism compile time polymorphism or method overloading
   a No of parameter are different
   b sequance of parameter are different
   c Type of parameter are different
2 Dynamic polymorpism run time polymorpism  metho overriddng
 */
public class MethodOverloadingExample {
    void displaymsg(){
        System.out.println("A method with no argument called");
    }
    void diplaymsg(String msg){
        System.out.println("A metho with one argument called msg" +msg);
    }
    void displaymsg(int num){
        System.out.println(" A method with one argument called num"+ num);
    }
    void displaymsg(String msg, int num){
        System.out.println(" A method with one argument called msg" + msg + "num"+ num);

    }
    void displaymsg( int num, String msg){
        System.out.println(" a method with one argument called int" + num + "msg" + msg);
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.displaymsg();
    }
}
