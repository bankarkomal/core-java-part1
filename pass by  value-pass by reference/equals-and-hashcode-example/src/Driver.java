public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Komal",101,23);

        Student student2 = new Student("Komal",101,23);

        Student student3 = new Student("Omkar",101,23);

        Student student4 = student1;

        Employee employee = new Employee("Omkar",101,23);

        System.out.println(student1.equals(student2));

        System.out.println(student1.equals(student3));

        System.out.println(student1.equals(employee));

        System.out.println(student1.equals(student4));
        System.out.println("Hash code for student1 is:" + student1.hashCode());
        System.out.println("Komal hash code is : "+ "K".hashCode());
        System.out.println("Komal hash code is : "+ "ko".hashCode());
        System.out.println("Komal hash code is : "+ "kom".hashCode());
        System.out.println("Komal hash code is : "+ "koma".hashCode());


    }
}
