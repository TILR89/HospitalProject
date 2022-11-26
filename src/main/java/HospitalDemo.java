public class HospitalDemo {
    public static void main (String[] args) {

        Hospital h = new Hospital("Kyiv city main hospital", "15, Sagaidachnyi street");

        Laboratory l = new Laboratory("Dila", "15, Sagaidachnyi street", 401, "Blood analysis");

        Patient p = new Patient("Michael", "Men", 45, 919, "Headache", "Migraine", "To divorce");



        System.out.println(h);
        System.out.println(l);
        System.out.println(p);



    }

}
