package enums;

public enum Complaints {

    Headache("headache"), BackPain ("back pain"), Heartache ("heartache"), Toothache ("toothache"), Weakness ("weakness");

    private String complaints;

    Complaints(String complaints) {
        this.complaints = complaints;
    }

    public String getComplaints(){
        return complaints;
    }
}
