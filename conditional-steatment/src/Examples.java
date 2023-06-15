/*
1 Variable--> variable can store the value and it can change the program
2 constants-->value of constants doesn`t change in the program-->finial keyword
3 conditionl steatment-->if and if else
4 control steatment -->switches
5 loops
 */
public class Examples {
    public static void main(String[] args) {
        int salary;
        int age = 25;
        salary = 30000;
        System.out.println(" salary:"+ salary + "age: " + age);
        if (age>18){
            System.out.println("you are eligible for voting...");
        }else{
            System.out.println("You are under 18 not eligible for vote");
            if(salary>500000){
                System.out.println(" your salary is more than 50k");
            } else if (salary>40000) {
                System.out.println(" Your salary is more than 40k");
            } else if (salary>30000) {
                System.out.println(" Your salary is greater than 30k");

            }else{
                System.out.println("your salary is less than 30k");
            }
        }
        salary = 40000;
        System.out.println("salary : " + salary + "age: " + age);
        final String dob = "12/03/1999"; //here 12/03/1999 is called string litreal and creats string object
        // dob is constants and it can not be reassigned
        System.out.println("Date Of Birth:" + dob);
        //dob= 13/03/1999;


    }

}
