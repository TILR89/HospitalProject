package enums;

public enum PermitLevel {
    High("High"), Basic ("Basic");
    private String permitLevel;

    PermitLevel(String permitLevel) {
        this.permitLevel = permitLevel;
    }

    public String getPermitLevel(){
        return permitLevel;
    }
}
