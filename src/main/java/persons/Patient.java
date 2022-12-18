package persons;

import enums.Complaints;
import enums.Gender;
import exceptions.PatientInfoIllegalArgException;
import exceptions.ScannerException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
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
        return "persons.Patient account " + accountNumb + " complaints " + complaints + " diagnosis is " + diagnosis + " prescription is " + prescriptions;
    }

    public int checkPatientAge() throws ScannerException, ParseException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();

            if (x != accountNumb) {
                throw new ScannerException("Account number is not exists. Enter valid account number.");
            }
            return getAge();
        }
    }


}
