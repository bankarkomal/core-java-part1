import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //Read same string or user input form console
        //Read-Write-->Input output
        System.out.println("Please enter an input:");

        Scanner scanner = new Scanner(System.in);

        String dayOfweek = scanner.next();
        switch (dayOfweek){

               case  "Monday":
                System.out.println("Monday are booring");
                break;
               case "Tuesday":
                System.out.println("Tuesday better than Monday");
               break;
               case  "Wednsady":
                System.out.println("Wednsday are okyas");
                break;
               case  "Thursady":
                System.out.println("Thursday is day I am go to office");
                break;

               case  "Friday":
                System.out.println("Summer fiday are half days");
                break;
               case  "Saturday":
                System.out.println("First day weekend");
                break;
            case "Sunday":
                System.out.println("Sunay is a holiday");
                break;
            default:
                System.out.println("User has invalid input");

        }


    }
}
