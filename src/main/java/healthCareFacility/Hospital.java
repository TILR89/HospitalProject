package healthCareFacility;

import enums.PropertyType;
import exceptions.BuildingLessThanZeroException;
import healthCareFacility.Building;

public class Hospital extends Building implements IGetInfo {
    private String name;
    private String address;

    public Hospital() {
    }

    public Hospital(PropertyType propertyType, int startAreaSquare, int startStoreys, String startName, String startAddress) {
        super(propertyType, startAreaSquare, startStoreys);
        name = startName;
        address = startAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws BuildingLessThanZeroException {
        if (name.length() < 1) {
            throw new BuildingLessThanZeroException("Please enter a new Hospital name", new RuntimeException());
        } else {
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() > 1) {
            this.address = address;
        } else {
            System.out.println("Enter valid address");
        }
    }

    public String toString() {
        return "Hospital " + name + " address is " + address;
    }


    @Override
    public void showInfo() {
        System.out.println("Hospital name is " + name + " address is " + address);

    }
}



