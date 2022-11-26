public class Doctor extends Person {
    //fields
    private String specialty;

    //constructor
   public Doctor(String startName, String startGender, int startAge, String startSpecialty) {
        super(startName, startGender,startAge);
        specialty = startSpecialty;
    }

    //toString

    public String toString(){
        return specialty;
    }




    //getters and setters
    public String getSpecialty(){
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //methods
    public void treat(){

    }





}
