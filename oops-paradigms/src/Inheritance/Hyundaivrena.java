package Inheritance;

public class Hyundaivrena {
    // string brandname;
    // string yearofman;
    // int cc;
    // boolean ispetrol;
    boolean hasSunroof;
    boolean isAutomatic;

    public Hyundaivrena(boolean hasSunroof, boolean isAutomatic) {
        super();
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
        return "Hyundaiverna{" +
                "hasSunroof=" + hasSunroof +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}


