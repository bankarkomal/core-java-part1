package some.enumexample;
//enum is a predefined set of constant.
//e.g season is an predefind constant
//enum is very similar to class
//enum can have filed it can have also constructo or method
//enum is constant is by default public static final type of enum
//each enum constant written in capital letter
//enum is basicaly class but only difference is its object precrated at the time of enum loading
//static variable and static blocks are intialized and exeuted when class is loaded into memroy of classloader

public enum Season {
    //set of enum constant these basically enum object
    //publisc static final season SUMMER = new seasons("SUMMER is very hot) SUMMER object is created
    SUMMER("SUMMER is very hot"),
    //public static final season WINTER = new season ("WINTER is very beautiful or nice)
     WINTER( "I like WINTER"),
    //public static final season RAINY =  new seasons("I love Rainy)

    RAINY("I love RAINY");
    // all the three variable are enum object and they are created when the class is
    // will get loaded
    //Because all of them are static,

    //Instance variable
            String msg;

     //Constructor --> this  cons made  atomatically private  by java complier


    Season(String msg) {
        this.msg = msg;
        System.out.println("msg from constructor " + msg);

    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Season{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
