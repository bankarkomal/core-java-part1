import java.util.concurrent.Callable;

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
/*
There are two ways handling exception
1 Using try catch block
2 Using throws keywords with method header
 */
public class ExceptionHandlingUsingThrowsKeywords {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 0;
        // Tne statement (s) that cause an must be put inside try block must
        //should have catch block to catch e
        // if an exception occur then associated catch block is called
        // normal flow of program get executed
        try {
            c = getC(a,b);

        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        } finally{
            //finally is used to free the resources
             //Here resources means db connections or file connection or sockets.
             System.out.println("finally block always gets executed not matter " +
                     "exception occurs or not");
        }
        System.out.println(c);
        for (int i = 0 ; i<10; i++){
            System.out.println(i);
        }

    }
    private static int getC( int a ,int b ) throws ArithmeticException{
        int c = 0 ;
        c = a/b;
        System.out.println("getc method called");
        return c;
    }
}