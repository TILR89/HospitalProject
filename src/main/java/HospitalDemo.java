import enums.Complaints;
import enums.Gender;
import enums.PropertyType;
import exceptions.ScannerException;
import healthCareFacility.Laboratory;
import healthCareFacility.Therapy;
import org.apache.logging.log4j.*;
import persons.Doctor;
import persons.Nurse;
import persons.Patient;
import persons.Person;

import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


public class HospitalDemo {
    public static void main(String[] args) throws ScannerException, ParseException {
        Logger LOGGER = LogManager.getLogger(HospitalDemo.class);

        Laboratory dila = new Laboratory(PropertyType.Private, 120, 1, "Dila", 24, "Main analysis" );

        Doctor d = new Doctor("John", "Smith", Gender.Male, 50, "Therapist");

        Patient p = new Patient("Bob", "Wild", Gender.Male, 40, 123, Complaints.BackPain, "Uncertain", "Visit doctor");

        Therapy therapy = new Therapy();

        String complaint = d.getPatientComplaints();
        System.out.println(complaint);
        String doctorsDiagnosis = d.setPatientDiagnosis(complaint);
        System.out.println(doctorsDiagnosis);
        System.out.println(therapy.drugPrescribe(doctorsDiagnosis));

/*
        int bobAge = p.checkPatientAge();
        System.out.println("Bob age is" + bobAge);


        p.setAccountNumb(101);
        int acc = p.getAccountNumb();
        System.out.println(acc);

 */


        therapy.addDrugs("Morphine");
        therapy.addDrugs("Ibuprofen");
        therapy.addDrugs("Aspirin");
        therapy.addDrugs("Diclofenac");
        System.out.println(therapy.drugs);
        therapy.addDrugs( 2, "Menthol");
        System.out.println(therapy.drugs);
        therapy.removeDrugs("Aspirin");
        System.out.println(therapy.drugs);


        System.out.println(therapy.drugIndex("Aspirin"));
        therapy.drugs.remove(2);
        System.out.println(therapy.drugs.size());

        therapy.addWhoRecommend("Brush your teeth");
        therapy.addWhoRecommend("Drink at least 1,5L of water daily");
        therapy.getRecommend();

        dila.addAnalysis(0, "Blood type analysis");
        dila.addAnalysis(1, "Blood chemistry");
        dila.addAnalysis(2, "Blood sugar test");
        dila.addAnalysis(45, "Hormone analysis");
        dila.removeAnalysis(45);

/*
        int k = 1;
        for(int i=0; i<4; i++){

            for(int j = 1 ; j<=4-i; j++){
                System.out.print(k);
                System.out.print("\t");
                k++;}
                System.out.println("");
            }

        int l =1;
        for (int i=1; i<5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(l);
                System.out.print("\t");
                l++;
            }
            System.out.println("");
        }

 */
    }

}
