/*
  String Builder:-represent a mutable sequance chracter
  The instance of this classdoes not guraantee synchronization
  and hence should not uedd multithred envirionment
  whenever string Builder is faster than string Buffer under most implemnetation
 */
// String Buffer:- Thread safe mutable sequance character
// length of the contact sequance can be changed through the certian method call
//method of the string Buffer class are synchronized
//append :-metohd add this chracter at the end of the Buffer
// insert:- method  add this chracter at a speicified point
public class Example {
    public static void main(String[] args) {
        StringBuilder StringBuilder = new StringBuilder("Komal");
        System.out.println(StringBuilder);
        StringBuilder.append("Bankar");//append:-String representationof the specified arg
        // to specified stringBuilder instance sequance
        System.out.println(StringBuilder);
    }
}
