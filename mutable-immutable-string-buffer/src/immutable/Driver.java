package immutable;


public class Driver {
    public static void main(String[] args) {
        Address address = new Address(101,"park street","Baramati",413114);
        Employee employee = new Employee(102,300000,"komal",address);

        System.out.println(employee);
        address.setLineNum(103);
        System.out.println(employee);
        employee.getAddress().setLineNum(200);
        System.out.println(employee);
    }

}
