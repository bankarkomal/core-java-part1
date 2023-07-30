
class Hardware<T extends Machine>{

}
class Machine{

}
class Laptop extends Machine{

}
class Mobile extends Machine{

}
class Printer{

}
public class BoundedGenericExample {
    public static void main(String[] args) {
        Hardware<Machine> MachineHardware = new Hardware<>();
        Hardware<Laptop> LaptopHardware = new Hardware<>();
        Hardware<Mobile> MobileHardware = new Hardware<>();
       // Hardware<Printer> PrinterHardware = new Hardware<Printer>(); // This not allowed
        //because printer is not subclass of a Machine class
        // and Hardware <E extend Machine> so E can only be Machine or Mobile or Laptop but not printer
    }
}


