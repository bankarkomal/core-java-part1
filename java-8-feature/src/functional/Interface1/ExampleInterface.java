package functional.Interface1;
// Functional Interface is an interface that has at most one abstract method -> exhibit only one method.
// it can have any number static method.
// it can have also any number of default method.
@FunctionalInterface
public interface ExampleInterface {
    int randomCalculate(int a , int b);// method declaration for abstract method.
    default void print(int result){
        System.out.println(result);
    }// default method is a concrete method that written in functional interface.
    default void print2 (){
        System.out.println("Inside print2 method ");
    }
    static void showmsg(String msg){
        System.out.println(msg);
    }
    static void showmsg2(String msg){
        System.out.println(msg);
    }
}

