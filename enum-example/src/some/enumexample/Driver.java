package some.enumexample;

import java.util.Arrays;
public class Driver {
    public static void main(String[] args) {
        System.out.println("Season values():" + Arrays.toString(Season.values()));
        for(Season season : Season.values()){
            System.out.println(season.msg);

        }
        System.out.println(Season. RAINY);
    }
}
