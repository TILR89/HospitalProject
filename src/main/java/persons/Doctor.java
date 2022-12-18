package persons;

import enums.Diagnosis;
import enums.Gender;

import javax.print.Doc;
import java.util.Objects;

public class Doctor extends Person {
    private String specialty;


    public Doctor() {
    }


    public Doctor(String startName, String startSurname, Gender gender, int startAge, String startSpecialty) {
        super(startName, startSurname, gender, startAge);
        specialty = startSpecialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if (specialty.isEmpty()) {
            System.out.println("Please enter your specialty.");
        } else {
            this.specialty = specialty;
        }
    }


    public String toString() {
        return "persons.Doctor specialty is " + specialty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return specialty == doctor.specialty && Objects.equals(specialty, doctor.specialty);
    }


    public String getPatientComplaints() {
        return String.valueOf(Patient.getComplaints());
    }


    public String setPatientDiagnosis(String complaint) {

        String patientDiagnosis = null;
        switch (complaint) {
            case "BackPain":
                patientDiagnosis = String.valueOf(Diagnosis.Cancer);
                break;
            case "Headache":
                patientDiagnosis = String.valueOf(Diagnosis.Migraine);
                break;
            case "Toothache":
                patientDiagnosis = String.valueOf(Diagnosis.Caries);
                break;
            default:
                System.out.println("You should take a blood test");
        }
        return patientDiagnosis;


    }

}
