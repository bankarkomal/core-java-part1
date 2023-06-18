package Inheritance;

public class SkodaSlivia {
    // string brandname;
    // string yearofman;
    // int cc;
    // boolean ispetrol;
    int numofBags;
    public SkodaSlivia(int numofbags){
        System.out.println(this.getClass().getName()+ "called");
        this.numofBags = numofbags;
    }

    public SkodaSlivia( String brandname, String yearofman , int cc , boolean ispetrol , int numofBags)
    {
        super();
        this.numofBags= numofBags;
    }

    public int getNumofBags() {
        return numofBags;
    }

    public void setNumofBags(int numofBags) {
        this.numofBags = numofBags;

    }

    @Override
    public String toString() {
        return "SkodaSlivia{" +
                "numofBags=" + numofBags +
                '}';
    }
}
