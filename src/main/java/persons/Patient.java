package persons;

import enums.Complaints;
import enums.Gender;
import exceptions.PatientInfoIllegalArgException;
import exceptions.ScannerException;
import org.apache.logging.log4j.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient extends Person {
    Logger LOGGER = LogManager.getLogger(Patient.class);
    private int accountNumb;
    static protected Complaints complaints;
    private String diagnosis;
    private String prescriptions;

    public Patient() {
    }

    public Patient(String startName, String startSurname, Gender gender, int startAge, int startAccountNumb, Complaints complaints, String startDiagnosis, String startPrescriptions) {
        super(startName, startSurname, gender, startAge);
        accountNumb = startAccountNumb;
        Patient.complaints = complaints;
        diagnosis = startDiagnosis;
        prescriptions = startPrescriptions;
    }


    public int getAccountNumb() {
        return accountNumb;
    }

    public void setAccountNumb(int accountNumb) {
        if (accountNumb < 99)
            LOGGER.error(PatientInfoIllegalArgException.MESSAGE_ACCOUNT);
        else {
            this.accountNumb = accountNumb;
        }
    }

    public static Complaints getComplaints() {
        return complaints;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        if (prescriptions.isEmpty()) {
            LOGGER.error("Diagnosis is unknown");
        } else {
            this.prescriptions = prescriptions;
        }
    }


    public String toString() {
        return super.getName() +" "+ super.getSurname() + " " + getAge() +" " + getGender() + " " + "Patient account is " + accountNumb + " complaints " + complaints + " diagnosis is " + diagnosis + " prescription is " + prescriptions;
    }

    public int checkPatientAge() throws ScannerException {
        LOGGER.info("Please enter a valid account number to get a patient age:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x != accountNumb) {
            throw new ScannerException("Account number is not exists. Enter valid account number.");
        } else {
            return getAge();
        }
    }

    List<Patient> patients = new ArrayList<>();

    public static List<Patient> getPatients(){
        return List.of(
                new Patient("John", "Wild", Gender.Male, 45, 124, Complaints.Heartache, "Uncertain", "Visit doctor"),
                new Patient("Sam", "Smith", Gender.Male, 25, 125, Complaints.BackPain, "Uncertain", "Visit doctor"),
                new Patient("Joanna", "Blackburn", Gender.Female, 18, 126, Complaints.Toothache, "Uncertain", "Visit doctor"),
                new Patient("Morty", "Crest", Gender.Male, 75, 127, Complaints.Weakness, "Uncertain", "Visit doctor"),
                new Patient("Jane", "Dow", Gender.Female, 32, 128, Complaints.BackPain, "Uncertain", "Visit doctor"),
                new Patient("Johny", "Walker", Gender.Male, 45, 129, Complaints.Headache, "Uncertain", "Visit doctor"),
                new Patient("Anna", "Smith", Gender.Female, 26, 130, Complaints.Headache, "Uncertain", "Visit doctor")
        );
    }


}
