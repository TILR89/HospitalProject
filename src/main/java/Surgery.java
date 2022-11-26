public class Surgery extends Hospital {
    int cabinet;
    String surgeryType;

    //constructor
    public Surgery(String startName, String startAddress, int startCabinet, String startSurgeryType) {
        super(startName, startAddress);
        cabinet = startCabinet;
        surgeryType = startSurgeryType;
    }

    //toString
    public String toString(){
        return cabinet + " " + surgeryType;

    }

    //getters and setters
    public int getCabinet(){
        return cabinet;
    }

    public void setCabinet(int cabinet){
        this.cabinet = cabinet;
    }

    public String getSurgeryType(){
        return surgeryType;
    }
    public void setSurgeryType(String surgeryType){
        this.surgeryType = surgeryType;
    }

}
