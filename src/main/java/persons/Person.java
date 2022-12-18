package persons;

import enums.Gender;
import exceptions.PatientInfoIllegalArgException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

abstract public class Person {
    Logger LOGGER = LogManager.getLogger(Person.class);
    private String name;
    private String surname;
    //private String gender;
    private Gender gender;
    private int age;

    public Person() {
    }

    public Person(String startName, String startSurname, Gender gender, int startAge) {
        name = startName;
        surname = startSurname;
        this.gender = gender;
        age = startAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            LOGGER.error(PatientInfoIllegalArgException.MESSAGE_NAME);
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {

        if (surname.isEmpty()) {
            LOGGER.error(PatientInfoIllegalArgException.MESSAGE_SURNAME);
        } else {
            this.surname = surname;
        }
    }

    public Gender getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            LOGGER.error(PatientInfoIllegalArgException.MESSAGE_AGE);
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "The name is " + name + surname + ". The gender is " + gender + ". The age is " + age + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(gender, person.gender);
    }


}
