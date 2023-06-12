package entities;

public class colleage {
    String name;
    int numofstudent;
    int numofstaff;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumofstudent() {
        return numofstudent;
    }

    public void setNumofstudent(int numofstudent) {
        this.numofstudent = numofstudent;
    }

    public int getNumofstaff() {
        return numofstaff;
    }

    public void setNumofstaff(int numofstaff) {
        this.numofstaff = numofstaff;

    }

    @Override
    public String toString() {
        return "colleage{" +
                "name='" + name + '\'' +
                ", numofstudent=" + numofstudent +
                ", numofstaff=" + numofstaff +
                '}';
    }
}





