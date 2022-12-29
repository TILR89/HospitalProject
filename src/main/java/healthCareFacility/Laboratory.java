package healthCareFacility;

import enums.PropertyType;

import java.util.ArrayList;
import java.util.HashMap;

public class Laboratory extends Building implements IGetInfo {

    private String labName;
    private int officeNumber;
    private String purpose;

    public Laboratory() {
    }

    public Laboratory(PropertyType propertyType, int startAreaSquare, int startStoreys, String startLabName, int startOfficeNumber, String startPurpose) {
        super(propertyType, startAreaSquare, startStoreys);
        labName = startLabName;
        officeNumber = startOfficeNumber;
        purpose = startPurpose;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String toString() {
        return "Laboratory " + officeNumber + " for " + purpose;
    }


    @Override
    public void showInfo() {
        System.out.println("Laboratory " + labName + " provides service of " + purpose);
    }

    protected HashMap<Integer, String> analysis = new HashMap<>();

    public void addAnalysis(int index, String analysisName) {
        analysis.put(index, analysisName);
    }

    public void removeAnalysis(int index) {
        analysis.remove(index);
    }

    public void removeAnalysis(String analysisName){
        analysis.remove(analysisName);
    }

    public ArrayList<Laboratory> laboratories = new ArrayList<>();
    public void addLaboratory(Laboratory lab){
        laboratories.add(lab);
    }
    public ArrayList<Laboratory> getLaboratory(){
        return laboratories;
    }




}
