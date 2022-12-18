package persons;

import enums.Gender;
import persons.Staff;

import java.util.Objects;

public class FrontDeskStaff extends Staff {
    private int receptionistId;
    private int receptionistPhone;

    public FrontDeskStaff() {
    }

    public FrontDeskStaff(String startName, String startSurname, Gender gender, int startAge, String startJoined, String startEducation, String startJobTitle, int startReceptionistId, int startReceptionistPhone) {
        super(startName, startSurname, gender, startAge, startJoined, startEducation, startJobTitle);
        receptionistId = startReceptionistId;
        receptionistPhone = startReceptionistPhone;
    }

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public int getReceptionistPhone() {
        return receptionistPhone;
    }

    public void setReceptionistPhone(int receptionistPhone) {
        this.receptionistPhone = receptionistPhone;
    }

    public String toString() {
        return "Receptionist ID is " + receptionistId + " phone number is: " + receptionistPhone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptionistId, receptionistPhone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrontDeskStaff frontDeskStaff = (FrontDeskStaff) o;
        return receptionistId == frontDeskStaff.receptionistId && Objects.equals(receptionistId, frontDeskStaff.receptionistId) && Objects.equals(receptionistPhone, frontDeskStaff.receptionistPhone) ;
    }



    public void registerPatient() {
    }

    public void generateBill() {
        System.out.println("Your bill is");
    }
}
