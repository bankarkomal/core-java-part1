
// Error:-  an error in the program is an abnormal that can not be handled or recovered.
// Error's parent class is throwable
//some error   subclass are
// 1 MemoryOutOf error
// 2 AStackOverflow error
//3 java virtual machine error

public class ErrorExample {
    public static void main(String[] args) {
        sayHello();
    }
    static void sayHello(){
        System.out.println("Hello infinite  times");
        sayHello();
    }
}
