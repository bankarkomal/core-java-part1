package immutable;
//Employee is represention employee object
//How to create immutable object-rule
/*
1 Don't write setter all field (make field private)
2 write all argument constructor
3 Make class final, this means no other classes can inhariate this class. And hence can not change objcet state
4 Use deep clone method for mutable in constuctor
5 Use deep clone method for mutable in getter
 */
public  final class Employee {
    int id;
    String name;
     int salary;
     Address address;

    public  Employee(int id, int salary, String name, Address address) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = new Address(address.getLineNum(),address.getStreetName()
                ,address.getCity(),address.getPinCode());

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}

