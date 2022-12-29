import enums.Complaints;
import enums.Gender;
import enums.PropertyType;
import exceptions.ScannerException;
import healthCareFacility.Laboratory;
import healthCareFacility.Therapy;
import org.apache.logging.log4j.*;
import persons.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;


public class HospitalDemo {
    private static Logger LOGGER = LogManager.getLogger(HospitalDemo.class);

    public static void main(String[] args) throws ScannerException, ParseException, Exception {


        Laboratory dila = new Laboratory();
        Laboratory dila1 = new Laboratory(PropertyType.Private, 200, 2, "Dila1", 36, "Main analysis");
        Laboratory dila2 = new Laboratory(PropertyType.Private, 250, 3, "Dila2", 48, "Main analysis");
        Laboratory dila3 = new Laboratory(PropertyType.Private, 265, 3, "Dila3", 17, "Main analysis");
        Laboratory dila4 = new Laboratory(PropertyType.Private, 270, 2, "Dila4", 20, "Main analysis");
        Laboratory dila5 = new Laboratory(PropertyType.Private, 180, 1, "Dila5", 9, "Main analysis");

        Doctor d = new Doctor("John", "Smith", Gender.Male, 50, "Therapist");

        Patient p = new Patient("Bob", "Wild", Gender.Male, 40, 123, Complaints.BackPain, "Uncertain", "Visit doctor");

        Therapy therapy = new Therapy();


        List<Patient> patients = Patient.getPatients();

        List<Patient> females = patients.stream().filter(patient -> patient.getGender().equals(Gender.Female)).collect(Collectors.toList());
        females.forEach(System.out::println);
        System.out.println();

        List<Patient> sortedAge = patients.stream().sorted(Comparator.comparing(Patient::getAge).reversed()).collect(Collectors.toList());
        sortedAge.forEach(System.out::println);
        System.out.println();

        Double averagePatientsAge = patients.stream().collect(Collectors.averagingInt(Patient::getAge));
        System.out.println(averagePatientsAge);

        boolean anyMatch = patients.stream().anyMatch(patient -> patient.getAge() > 60);

        patients.stream().max(Comparator.comparing(Patient::getAge)).ifPresent(System.out::println);

        Map<Gender, List<Patient>> genderGroups = patients.stream().collect(Collectors.groupingBy(Patient::getGender));

        genderGroups.forEach((gender, patients1) -> {
            System.out.println(gender);
            patients1.forEach(System.out::println);
        });

        Optional<String> oldestMalePatient = patients.stream().filter(patient -> patient.getGender().equals(Gender.Male)).max(Comparator.comparing(Patient::getAge)).map(Patient::getName);
        oldestMalePatient.ifPresent(System.out::println);

        //Reflection
        AdministrativeStaff admin = new AdministrativeStaff();
        admin.setAdministratorId(666);
        Field[] adminFields = admin.getClass().getDeclaredFields();
        for (Field field : adminFields) {
            if (field.getName().equals("administratorId")) {
                field.setAccessible(true);
                field.set(admin, 777);
            }
            System.out.println(admin.getAdministratorId());
        }

        System.out.println();

        Method[] adminMethods = admin.getClass().getDeclaredMethods();
        for (Method method : adminMethods) {
            System.out.println(method.getName());
        }

        for (Method method : adminMethods) {
            if (method.getName().equals("addDuty")) {
                method.setAccessible(true);
                method.invoke(admin, "Sterilize tools");
            }
        }
/*
        String complaint = d.getPatientComplaints();
        System.out.println(complaint);
        String doctorsDiagnosis = d.setPatientDiagnosis(complaint);
        System.out.println(doctorsDiagnosis);
        System.out.println(therapy.drugPrescribe(doctorsDiagnosis));


        int bobAge = p.checkPatientAge();
        System.out.println("Bob age is" + bobAge);


        p.setAccountNumb(101);
        int acc = p.getAccountNumb();
        System.out.println(acc);

        LOGGER.info("Log to file");
        LOGGER.fatal("fatal");
        LOGGER.error("error");





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


        dila.addLaboratory(dila1);
        dila.addLaboratory(dila2);
        dila.addLaboratory(dila3);
        dila.addLaboratory(dila4);
        dila.addLaboratory(dila5);

 */


    }

}
