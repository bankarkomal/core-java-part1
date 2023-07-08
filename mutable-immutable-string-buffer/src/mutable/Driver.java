package mutable;
/*
* Mutable class
* class whose object after initilization can be modified are called mutable class
* Mutable means once field created it can modified even after the intilization
* That means field can modified  it any point in the program
 */

public class Driver {
    public static void main(String[] args) {
        Address address = new Address(101,"park street","Baramati",
                413114);
        Employee employee = new Employee(100,13000,"omkar",address);
        employee.id = 200;//employee objects id has changed,hence employee object has mutable.
    }
}
