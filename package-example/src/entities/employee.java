package entities;

public class employee {
    String Name;
    colleage colleageName;
    int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public colleage getColleageName() {
        return colleageName;
    }

    public void setColleageName(colleage colleageName) {
        this.colleageName = colleageName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "Name='" + Name + '\'' +
                ", colleageName=" + colleageName +
                ", age=" + age +
                '}';
    }
}
