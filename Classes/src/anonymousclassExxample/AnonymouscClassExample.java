package anonymousclassExxample;

public class AnonymouscClassExample {
    //Creating a anonymousc class that doent have a name but implement of an interface
    //The object is aiso created while defined in the anonymousc class example
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Run method called.");
        }
    };
    /*
    @override
    pulic viod run(){
    sout("A run method called");
    }
    }; this{  }; this anonymousc calss which is implementig ruunable interface

     */
    public static void main(String[] args) {
        //to access run methodwe need runnable and to access runnablewe need
        //Anonymouscclass Example's object
        AnonymouscClassExample anonymouscClassExample = new AnonymouscClassExample();
        anonymouscClassExample.runnable.run();

        }
        class RunnbleExample implements Runnable {
            @Override
            public void run() {
                System.out.println("A run method called");
            }
            }

        }
