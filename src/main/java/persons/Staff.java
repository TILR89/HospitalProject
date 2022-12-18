package persons;

import enums.Gender;

public class Staff extends Person {
    private String joined;
    private String education;
    private String jobTitle;

    public Staff() {
    }

    public Staff(String startName, String startSurname, Gender gender, int startAge, String startJoined, String startEducation, String startJobTitle) {
        super(startName, startSurname, gender, startAge);
        joined = startJoined;
        education = startEducation;
        jobTitle = startJobTitle;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle() {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Started work at " + joined + " education is" + education + " job title is " + jobTitle;
    }


}

