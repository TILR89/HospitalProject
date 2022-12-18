package persons;

import enums.Gender;
import persons.Staff;

import java.util.ArrayList;

public class Nurse extends Staff implements ITreatment {
    private int nurseId;

    public Nurse(){}

    public Nurse(String startName, String startSurname, Gender gender, int startAge, String startJoined, String startEducation, String startJobTitle, int startNurseId){
        super(startName, startSurname, gender, startAge, startJoined, startEducation, startJobTitle);
        nurseId = startNurseId;
        }

    public int getNurseId(){
        return nurseId;
    }

    public void setNurseId (int nurseId ){
        this.nurseId = nurseId;
    }


    public String toString(){
        return "persons.Nurse ID is " + nurseId+ " .persons.Nurse name is " + getName();
    }

    ArrayList<Nurse> nurses = new ArrayList<>();
    Nurse Angelica = new Nurse();
    Nurse Maria = new Nurse();

    public void addNurse(Nurse object){
        nurses.add(object);
    }
    public void getNurses(int index){
        nurses.get(index);
           }


    @Override
    public void patientExamination() {

    }

    @Override
    public void treatment() {

    }


}
