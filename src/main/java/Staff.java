public class Staff extends Person{
    private String joined;

    private String education;

    private String jobTitle;

    //constructor
    public Staff(String startName, String startGender, int startAge, String startJoined, String startEducation, String startJobTitle){
        super(startName, startGender, startAge);
        joined = startJoined;
        education = startEducation;
        jobTitle = startJobTitle;
    }
    //toString
    public String toString(){
        return joined + " " + education + " " + jobTitle;
    }

    //getters and setters
    public String getJoined(){
        return joined;
    }

    public void setJoined (String joined){
        this.joined = joined;
    }

    public String getEducation(){
        return education;
    }

    public void setEducation ( String education){
        this.education = education;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }


}

