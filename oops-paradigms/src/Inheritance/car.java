package Inheritance;

//parent classor base class or super class.
/*
Inhritance reduce duplicate code and bsic properties of similer classes can be extracted in a commomn class
that we will call as a base class. All similar class will extend/inheritane the base class
 */

public class car {

    String brandname;
    String yearofman;
    int cc;
    boolean ispetrol;
    public car(){
        System.out.println(this.getClass().getName()+ "called");
    }
    public car( String brandname, String yearofman, int cc, boolean ispetrol){
        System.out.println(this.getClass().getName()+ "called");
        this.brandname = brandname;
        this.yearofman = yearofman;
        this.cc = cc;
        this.ispetrol = ispetrol;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getYearofman() {
        return yearofman;
    }

    public void setYearofman(String yearofman) {
        this.yearofman = yearofman;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isIspetrol() {
        return ispetrol;
    }

    public void setIspetrol(boolean ispetrol) {
        this.ispetrol = ispetrol;
    }

    @Override
    public String toString() {
        return "car{" +
                "brandname='" + brandname + '\'' +
                ", yearofman='" + yearofman + '\'' +
                ", cc=" + cc +
                ", ispetrol=" + ispetrol +
                '}';
    }
}
