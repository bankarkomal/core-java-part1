package a.b.c;

public class AnotherC {
    public static void main(String[] args) {
        C objectInsidesamepkg = new C();
        objectInsidesamepkg.defaultvariable = 30;
      //  objectInsidesamepkg.privatevariablec=40;nota allowed
        objectInsidesamepkg.protectedvariablec=50;
        objectInsidesamepkg.publicvaraible=100;

    }
}
