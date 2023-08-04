
import java.util.Objects;

// Student is plan old java object(POJO).
// This student class contain basic field and their getter only.
//also contain basic overridden method like to-string, equal,hashcode.
// This student filed are final that means  one object is created their filed(state) can not changed
// so basically student is an immutable cla
/*
record:-
record introduce java 14as preview feature and was released in java 15.
record is immutable clas/ object.
we reduce the code the it will write POJO e.g(Student,Employee this is an immutable object)
Syntax
record student (string name , int Age){
}
By default record provide all argument constructor , thier getter e.g name() , age()
 */
record Student(String name, int age) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student student)) return false;

        return age == student.age
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age * 10);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Komal",23);
        System.out.println(student1.name() + " "+student1.age());
        System.out.println(student1.toString());
    }
}
