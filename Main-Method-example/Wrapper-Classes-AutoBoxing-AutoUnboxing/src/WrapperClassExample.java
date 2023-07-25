public class WrapperClassExample {
 /*
 Primitive data type
    1 byte = Byte
    2 char = Chracter
    3 short = Short
    4 int   = Integer  4 Byte -- 32 bits Min_value -2^31 and Max_value 2^31-1
    5 float  = Float  4 Byte
    6 long   = Long
    7 double = Double
    8 boolean = Boolean
  */
 public static void main(String[] args) {

  int x = 10;
  System.out.println("x :" + x);
  int y = x;// autoboxing
  System.out.println("y :" + y);
  System.out.println("Integer.MIN_VALUE:" + Integer.MIN_VALUE);
  System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);

  Integer Z = Integer.valueOf("10");

  String s = String.valueOf("10");
  Integer i = Integer.parseInt("10");

  Float f1 = 20.0F;
  Float f2 = f1;// Autoboxing - Automatic converts from  Float (primitive ) to float (Primitive wrapper)
  System.out.println("f1 :" + f1);
  System.out.println("f2 :" + f2);

  System.out.println("Float.MIN_VALUE:" + Float.MIN_VALUE);
  System.out.println("Float.MAX_VALUE:" + Float.MAX_VALUE);
  f1 = f2;// AutUnboxing - Automatic converts from  Float (primitive wrapper) to float (Primitive)
  System.out.println("f1 : " + f1);
  System.out.println("f2 : " + f2);


 }
}