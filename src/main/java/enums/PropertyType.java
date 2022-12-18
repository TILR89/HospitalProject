package enums;

public enum PropertyType {
    State("state"), Private ("private");
    //used "State" instead of "Public" to avoid conflict with java public
    private String propertyType;

    PropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyType(){
        return propertyType;
    }
}
