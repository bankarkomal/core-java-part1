//String pool:- while creating string objectin the heap area it
// checks if string object present in the string pool or not
//If string object not present in the string pool then it create new obj in the string pool
public class Main {
    public static void main(String[] args) {
        String name1 = "Johny";
        String name2 = "Johny";//name1.intern();
        String name3 = new String("Tohny");
        String name4 = "Tohny";
        System.out.println(name1 == name2);
        System.out.println(name3 == name4);

        }
    }
