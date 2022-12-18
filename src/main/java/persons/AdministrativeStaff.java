package persons;

import enums.Gender;
import enums.PermitLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.util.LinkedList;
import java.util.Objects;

public class AdministrativeStaff extends Staff {

    Logger LOGGER = LogManager.getLogger(AdministrativeStaff.class);
    private int administratorId;
    private PermitLevel permitLevel;


    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String startName, String startSurname, Gender gender, int startAge, String startJoined, String startEducation, String startJobTitle, int startAdministratorId, PermitLevel permitLevel) {
        super(startName, startSurname, gender, startAge, startJoined, startEducation, startJobTitle);
        administratorId = startAdministratorId;
        this.permitLevel = permitLevel;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public PermitLevel getPermitLevel() {
        return permitLevel;
    }


    public String toString() {
        return "Administrator ID is " + administratorId + " permit level is " + permitLevel + " administrator name is " + getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(administratorId, permitLevel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministrativeStaff administrativeStaff = (AdministrativeStaff) o;
        return administratorId == administrativeStaff.administratorId && Objects.equals(administratorId, administrativeStaff.administratorId) && Objects.equals(permitLevel, administrativeStaff.permitLevel) ;
    }


    public void setStaffJobTitle() {
        if (Objects.equals(String.valueOf(permitLevel), "High"))
            setJobTitle();
        else {
            LOGGER.error("You are not allowed to make any changes in Staff");
        }
    }

    public static void getList(LinkedList <?> myList){
        System.out.println();
    }

    LinkedList<String> dailyRoutine = new LinkedList<>();

    public void addDrugs(String duty) {
        dailyRoutine.add(duty);
    }
    public void addDrugs (int index, String duty){
        dailyRoutine.add(index ,duty);
    }

    public void removeDrugs(int index){
        dailyRoutine.remove(index);
    }

    public void removeDrugs(String duty){
        dailyRoutine.remove(duty);
    }




}
