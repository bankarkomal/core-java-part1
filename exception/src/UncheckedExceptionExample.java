public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int numArray[] = {1,2,3,4,5};//These 5 numbers are stored at indices 0,1,2,3,4
            //Trying to access a number at index 10

            System.out.println("Value of index in numOfArray : "+ numArray[10]);
            // above steament will throw OutOfBoundException as
            //Array only has 5 elements from 0 to 4 indices

        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){

            System.out.println("ArrayIndexOutOfBoundsException occurd :" +
                    arrayIndexOutOfBoundsException.getMessage());;
        }
        System.out.println("rest of code ! ! !");
    }
}
