import java.util.ArrayList;
import java.util.List;
public class GenericExampleBeforeJava5 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("Komal");
        list.add(101);
        list.add(20.0);
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(1));
        }

        String secondItem = (String) list.get(1);// we avoid compile time checking using explicit casting
        //But at run time this will change
        //bz right side value integer and left side is string
        //hence integer cannot be converted to string
        //hence exception class cast exception
    }
}
