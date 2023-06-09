import java.security.MessageDigest;

public class Employee {
    // attribute or field
    String name;
    int id;
    String address;
    Long phoneno;
    int salary;
    String gender;
    String compnyname;

    //constuctor -->constuct the object basically intialise the object

    /*
    1. constructor same name as the class name
    2. constructor does not have return type
    3. constuctor can have parameter
    4. construcor does not have return  value

    */
    // No argument constructor
    Employee() {
        System.out.println(" no argument constructor called");
        this.name = "  Ranjit ";
        this.id = 102;
        this.address = "Baramati";
        this.phoneno = 9890754511l;
        this.salary = 22000;
        this.gender = " male ";
        this.compnyname = " Arranvai construction ";


    }

    //parametrasied constructor
    Employee(String name, int id, String address, Long phoneno, int salary, String gender, String
            compnyname) {
        System.out.println(" paramterised ocnstructor called");
        this.name = name;
        this.id = id;
        this.phoneno = phoneno;
        this.salary = salary;
        this.gender = gender;
        this.address = address;
        this.compnyname = compnyname;

    }
    void displedObjectAndMessage(){
        System.out.println("Hello" +this.name);
        System.out.println(this.id + "/n" + this.salary);
    }

    }

 class TestClass{
     public static void main(String[] args) {
         Employee employee = new Employee();
         employee.displedObjectAndMessage();

     }
 }
