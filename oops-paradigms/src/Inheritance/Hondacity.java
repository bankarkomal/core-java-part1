package Inheritance;

//child class or derived or sub class.
public class Hondacity extends car {
    // string brandname;
    // string yearofman;
    // int cc;
    // boolean ispetrol;
    boolean hasSunroof;
    boolean isAutomatic;

    public Hondacity(boolean hasSunroof, boolean isAutomatic) {
        super("Honda", "2023", 1300, true);
        System.out.println(this.getClass().getName()+ "called");
        this.hasSunroof = hasSunroof;
        this.isAutomatic = isAutomatic;


    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }
    public boolean isAutomatic(){
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "Hondacity{" +
                "hasSunroof=" + hasSunroof +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}




