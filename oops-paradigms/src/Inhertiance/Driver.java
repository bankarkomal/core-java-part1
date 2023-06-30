package Inhertiance;

public class Driver {
    public static void main(String[] args) {

        Hondacity hondacity = new Hondacity(true, true);
        wheel wheel1 = new wheel();
        wheel wheel2 = new wheel();
        wheel wheel3 = new wheel();
        wheel wheel4 = new wheel();
        wheel[]wheels = new wheel[]{wheel1,wheel2,wheel3,wheel4};
        Hondacity hondacity1 = new Hondacity("Honda",
                "2023",
                1500,
                false,
                wheels);

        System.out.println(hondacity.toString());

        System.out.println(hondacity1.toString());

        Hyundiverina hyundiverina = new Hyundiverina(false, true);
            hyundiverina.toString();

            Skodaslavia Skodasliavia = new Skodaslavia(6);

        }
    }
