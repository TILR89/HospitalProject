package healthCareFacility;

import enums.PropertyType;

import java.util.Objects;

abstract public class Building {
    private PropertyType propertyType;

    private int areaSquare;

    private int storeys;

    public Building() {
    }

    public Building(PropertyType propertyType, int startAreaSquare, int startStoreys) {
        this.propertyType = propertyType;
        areaSquare = startAreaSquare;
        storeys = startStoreys;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public int getAreaSquare() {
        return areaSquare;
    }

    public void setAreaSquare(int areaSquare) {
        this.areaSquare = areaSquare;
    }

    public int getStoreys() {
        return storeys;
    }

    public void setStoreys(int storeys) {
        this.storeys = storeys;
    }

    public String toString() {
        return "The building property type is " + propertyType + " total area is " + areaSquare + " meters " + " and " + storeys + " storeys in height.";
    }

    public int hashCode() {
        return Objects.hash(propertyType, areaSquare, storeys);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return areaSquare == building.areaSquare && storeys == building.storeys && Objects.equals(propertyType, building.propertyType);
    }


}
