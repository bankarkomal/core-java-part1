public class Driver {
    public static void main(String[] args) {
        Address address = Address.getInstance();
        address.setSocityName("MoryaNagar");
        address.setFlatNumber("2701");
        address.setPinCode(413141);

        Employee employee = Employee.getInstance();
        employee.setName("Ranjit");
        employee.setAge( 27);
        employee.setSalary(30000);
        employee.setAddress(address);
        System.out.println(employee);

        Employee employee1 = Employee.getInstance();
        employee1.setName("Komal");
        employee1.setAge(23);
        employee1.setSalary(40000);
        employee1.setAddress(address);
        System.out.println(employee1);

    }

}
