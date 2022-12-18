package healthCareFacility;

import enums.PropertyType;

public class Surgery extends Hospital {
    int cabinet;
    String surgeryType;

    public Surgery(PropertyType propertyType, int startAreaSquare, int startStoreys, String startName, String startAddress, int startCabinet, String startSurgeryType) {
        super(propertyType, startAreaSquare, startStoreys, startName, startAddress);
        cabinet = startCabinet;
        surgeryType = startSurgeryType;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public String toString() {
        return "Cabinet number is " + cabinet + " " + surgeryType;
    }


}
