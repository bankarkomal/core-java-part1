public class Address {
    private String flatNumber;
    private String socityName;
    private  int pinCode;
    public static Address getInstance(){
        return new Address();
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getSocityName() {
        return socityName;
    }

    public void setSocityName(String socityName) {
        this.socityName = socityName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNumber='" + flatNumber + '\'' +
                ", socityName='" + socityName + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
