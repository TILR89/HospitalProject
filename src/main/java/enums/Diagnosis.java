package enums;

public enum Diagnosis {
    Cancer("cancer"), Migraine ("migraine"), Schizophrenia ("schizophrenia"), Diabetes ("diabetes"), Caries ("caries"), Uncertain("uncertain");

    private String diagnosis;

    Diagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(){
        return diagnosis;
    }
}
