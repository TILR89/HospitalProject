public class Patient extends Person{
    //fields
    private int accountNumb;

    private String complaints;

    private String diagnosis;

    private String prescriptions;

    //constructor
    public Patient(String startName, String startGender, int startAge, int startAccountNumb, String startComplaints, String startDiagnosis, String startPrescriptions){
        super(startName, startGender, startAge);
        accountNumb = startAccountNumb;
        complaints = startComplaints;
        diagnosis = startDiagnosis;
        prescriptions = startPrescriptions;

    }

    //toString

    public String toString(){
        return accountNumb + " " + complaints + " " + diagnosis + " " + prescriptions;
    }

    //getters and setters
    public int getAccountNumb(){
        return accountNumb;
    }

    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }

    public String getComplaints(){
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescriptions(){
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }


}
