// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace char
public class Main {
    public static void main(String[] args[]){
        /*
        here new operator creates and object of type car in the heap,
        assume address 1000h. and my car  is a reference variable object
        created new operator and my car points this object of 1000h
        Basically my car reference variable hold the address of 1000h
         */

        Car myCar = new Car("Honda");
        System.out.println("Car brand is : "+myCar.getBrandName());//prints Honda

        changeCarReference(myCar);//this method passes 1000h value(actually the address of new object created)
        /*
        This function will not change the address hold by myCar reference .
         */

    }

    public static void changeCarReference(Car carRef){
        /*
        here carRef holds address of Car Object that is 1000h when
        changeCarReference method is called .
         */
        System.out.println("car brand is : "+carRef.getBrandName());
        /*
        This confirms that carRef holds 1000h as address and points to same Object as
        of myCar reference
         */


        carRef.setBrandName("Toyota");
        /*
        This will change the brand name of Car Object at address 1000h in heap to Toyota
         */

        System.out.println("car brand is : "+carRef.getBrandName());//prints Toyota
        /*
        This confirms that carRef points to 1000h address and points to same Object
        as of myCar reference and changed the brand name of Car Object at 1000h to Toyota
         */



        Car newCar = new Car("Tata");
        /*
        here 'new' operator created a new Object of type Car in the heap , assume at
        address 2000h and newCar reference points to 2000h
         */


        carRef = newCar ;//Now carRef points to address of new Car created above that is 2000h.
        System.out.println("car brand is : "+carRef.getBrandName());//prints Tata
        //This confirms that carRef points to object at 2000h as it printed Tata
    }

    }
