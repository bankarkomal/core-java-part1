package entities;

public class address {
    String LineNum;
    String FlatNum;
    String Taluka;
    String District;
    String State;

    public String getLineNum() {
        return LineNum;
    }

    public void setLineNum(String lineNum) {
        LineNum = lineNum;
    }

    public String getFlatNum() {
        return FlatNum;
    }

    public void setFlatNum(String flatNum) {
        FlatNum = flatNum;
    }

    public String getTaluka() {
        return Taluka;
    }

    public void setTaluka(String taluka) {
        Taluka = taluka;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "address{" +
                "LineNum='" + LineNum + '\'' +
                ", FlatNum='" + FlatNum + '\'' +
                ", Taluka='" + Taluka + '\'' +
                ", District='" + District + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
