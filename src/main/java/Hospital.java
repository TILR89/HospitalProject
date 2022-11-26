public class Hospital {
private String name;
private String address;

//constructor
public Hospital(String startName, String startAddress){
    name=startName;
    address = startAddress;
}

    //toString

    public String toString(){
        return name + " " + address;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}



