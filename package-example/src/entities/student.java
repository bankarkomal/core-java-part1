package entities;



public class student {
    String Name;
    colleage c0lleage;
    int id;
    address address;
    public student(){
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public colleage getC0lleage() {
        return c0lleage;
    }

    public void setC0lleage(colleage c0lleage) {
        this.c0lleage = c0lleage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public entities.address getAddress() {
        return address;
    }

    public void setAddress(entities.address address) {
        this.address = address;
    }

    public student(String Name, colleage colleage, int id, address address){
        this.Name = Name;
        this.c0lleage = getC0lleage();
        this.id = id;
        this.address = address;

     }

    @Override
    public String toString() {
        return "student{" +
                "Name='" + Name + '\'' +
                ", colleageName=" + c0lleage +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
