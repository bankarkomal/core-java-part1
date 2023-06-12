package driver;

import entities.address;
import entities.colleage;
import entities.student;

public class Driver {
    public static void main(String[] args) {
        address address = new address();
        address.setFlatNum("A103");
        address.setLineNum("solapur road");
        address.setTaluka("Haveli");
        address.setDistrict("Pune");
       address.setState("MH");

        colleage collesage = new colleage();
        collesage.setName("COE");
        collesage.setNumofstudent(100);
        collesage.setNumofstaff(50);
        student student = new student();
        student.setName("Omkar");
        student.setId(103);
        student.setAddress(address);
        student.setC0lleage(collesage);


        System.out.println(address.toString());
        System.out.println(collesage.toString());
        System.out.println(student.toString());
    }
}
