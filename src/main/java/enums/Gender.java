package enums;

public enum Gender {
    Male("male"), Female ("female");
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }
}
