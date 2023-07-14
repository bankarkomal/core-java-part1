package innerclass;
//Outer class
// Can have only 2 access level one is public and other is default
public class DataStructure {
    private Integer num = 10;
    // inner class is just another filed or object
    //it can have all access level e.g public, private, default,protected
    private class printer {
        void display() {
            System.out.println(num);
            for (int i = 0; i <=10; i++) ;
            System.out.println("i = "+ 'i');
        }
    }
    void showmsg(){
        System.out.println("A message from outer class");
    }

    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();// first create outer class object
        dataStructure.showmsg();
        printer printer = dataStructure.new printer();// then we create outer clas object to
        // inner class object
        printer.display();



    }
}

