public class Person {

    private String name;
    private String gender;
    private int age;

    //constructor
    public Person(String startName, String startGender, int startAge ) {
        name = startName;
        gender = startGender;
        age = startAge;
      }

    //    //toString
        public String toString(){
           return name + " " + gender + " " + age;

       }


    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return  gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }





}
