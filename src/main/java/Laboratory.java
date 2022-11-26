public class Laboratory extends Hospital {
    int officeNumber;
    String purpose;

    //constructor
    public Laboratory(String startName, String startAddress, int startOfficeNumber, String startPurpose) {
        super(startName, startAddress);
        officeNumber = startOfficeNumber;
        purpose = startPurpose;
    }
    //toString
    public String toString(){
        return officeNumber + " " + purpose;

    }

    //getters and setters
    public int getOfficeNumber(){
        return officeNumber;
    }
    public void setOfficeNumber(int officeNumber){
        this.officeNumber=officeNumber;
    }

    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(String purpose){
        this.purpose=purpose;
    }


}
