
//student properties
/*
   String=name
   int =age
   char=div
   int=id
   string=college name
   study()
   play()
   commute()
   // student bhaiviour/action
      study()
      play()
      commute()
 */
/*
class is user defined data typesor non primitive data types
or it is blue print for the object.
class student--> There are user defined data types or non DT
This class student can have multiple object eg komal,ranjit,omkar.

  #  Student propertiesor field

    string - name
    char   - div
    int   - id
    string- college name

   # student bhaviour/ Action

     Viod study ()
     Viod play ()
     Viod commute ()


 */


public class Student {
    String name;
    int age;
    char div;
    int id;
    String collegename;

    // Methos or bhaviour or action

    void study() {
        System.out.println(this.name + " is studying");

    }

    void play() {
        System.out.println(this.name + " is playing");
    }

    void commute() {
        System.out.println(this.name + " is commmuty");
    }
}

class Example {
    public static void main(String[] args) {
        // object is a entity of class
        int x = 200;
        //properties of komal
        Student komal = new Student();
        //student is object oriented class
        // komal is a refrence variablefor the object
        // student()is a no argument constructor call
        komal.name = "komal";
        komal.age = 24;
        komal.id = 101;
        komal.div = 'A';
        komal.collegename = "SMSVMP";
        // Method of komal
        komal.commute();
        komal.play();
        komal.study();
        Student Ranjit = new Student();
        Ranjit.name = " Ranjit ";
        Ranjit.age = 35;
        Ranjit.id = 102;
        Ranjit.div = 'B';
        Ranjit.collegename = " COE ";
        Ranjit.commute();
        Ranjit.play();





    }

}
