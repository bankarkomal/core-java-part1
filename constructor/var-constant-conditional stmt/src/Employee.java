import java.util.Date;

/*
1 variable-variable can store value and can not change in the program
2  Constant
3  conditional steatment-->if and if else
4  Control steatment-->switches
 5 loops

 */
public class Employee {
    public static void main(String[] args) {
        int salary;
        int age = 25;
        salary = 30000;
        System.out.println("salary : " + String.valueOf(salary) + "age : " + "age" );
        if (age > 18){
            System.out.println("You are eligible for voting...");
        } else {
            System.out.println("You are under 18 cannot be vote...");
        }
        if (salary > 50000){
            System.out.println("You are salary more than 50k");
            if (age > 18){
                System.out.println("You are eligible for voting...");
            } else {
                System.out.println("You are under 18 cannot be vote...");
            }
        } else if(salary > 40000){
            System.out.println("You are salary more than 40k");
            if (age > 18){
                System.out.println("You are eligible for voting...");
            } else {
                System.out.println("You are under 18 cannot be vote...");
            }
        } else if (salary > 30000) {
            System.out.println("You are salary is greater than 30k");
            if (age > 18){
                System.out.println("You are eligible for voting...");
            } else {
                System.out.println("You are under 18 cannot be vote...");
            }
        }else {
            System.out.println("You are salary is less than 30k");

        }

        salary = 40000;
        System.out.println(" slary : " + "salary" + "age : " + "age");

        final String dob ="27/01/2022";// this "27/01/2022" called string literal and creating string oject
       //here dob is string object it can not be reassigend
        System.out.println("Date Of Birth:" + "dob");
      // dob =  28/01/2022;

    }
}
