
/*
 String:-the string class represent character string
 Strings are constant;there values cannot be changed after they are created
 Beacuse string object are immutable
 They can be shared between multiple therad
 string are good for multiple threads
 There are two ways creating string object
 1 Using String Litral
 2 Using new keyword
 The + operator is overloaded string
 */

public class StringExample {
    public static void main(String[] args) {
        String name1 = "Komal";
        //here string litreal creating string object
        String name2 = new String("Bankar");
        //here new keyword used to create string object
        System.out.println(name1==name2);
        
    }
}
