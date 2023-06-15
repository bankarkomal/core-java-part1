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
        this.name = "  Ranjit";
        this.id = 102;
        this.address = "Baramati";
        this.phoneno = 9890754511l;
        this.salary = 1000;
        this.gender = " male ";
        this.compnyname = " Arranvai construction ";


    }

    //parametrasied constructor
    Employee(String n, int id, String address, Long phoneno, int salary, String gender, String
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

    void displedObjectAndMessage() {
        System.out.println("Hello" + this.name);
        System.out.println(this.id + "/n" + this.salary + "/n" + this.phoneno + "/n" + this.gender
                + "/n" + this.address + "/n" + this.compnyname);
    }

}

class TestClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee();//employee1=1000h employee1 hvae a 7 field
        employee1.displedObjectAndMessage();

        Employee employee2 = new Employee();//employee2=2000h employee1 hvae a 7 field
        employee2.displedObjectAndMessage();

        Employee employee3 = new Employee();//employee3=3000h employee1 hvae a 7 field
        employee3.displedObjectAndMessage();

        Employee employee4 = new Employee("Ajit", 102, "Baramati", 9890754511l,
                9000, "Male", "Reliance");
        //employee=4000h
        employee4.displedObjectAndMessage();
        Employee employee5 = new Employee("Omkar", 102, "Baramati", 7767997181l,
                5000, "Male", "Ms");
        employee5.displedObjectAndMessage();
    }
}
