
//Exception :- Exception is  abnormal behaviour in the program
// when an exception occur in the program, and it is not handle in  properly then
// the line below the exception do not get executed
// Exception are two type
//1 Compile time exception :- These exception thrown while compiling the program
// 2 Run time exception :- These exception are thrown when program is executed
/*
 In exception hierarchy Top level class is throwable
 Exception class extend throwable
 Compile time Exception :- IOException extends exception
 Compile time exception:- ClassNotFoundException extends exception
 Compile time exception:- fileNotFound exception
 rumTimeException:- Runtime exception extend Exception
 ArithmeticException extend runtime exception
 NullPointerException extend runtime exception
 IndexOutOfBound exception extends runtime exception
 
 */
public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a/b;// exception occurs here as / 0 is undefined
      // steament  below this line will not be executed if exception not handeld
        System.out.println(c);
        for(int i = 0; i<0; i++);{
            System.out.println('i');
        }


    }
}
