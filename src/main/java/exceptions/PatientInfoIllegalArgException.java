package exceptions;

public class PatientInfoIllegalArgException extends IllegalArgumentException {
    public static final String MESSAGE_CONSTRUCTOR = "Please enter valid information";
    public static final String MESSAGE_ACCOUNT = "Account number should consist at least of 3 digits. ";

    public static final String MESSAGE_NAME = "Name field should not be empty";

    public static final String MESSAGE_SURNAME = "Surname field should not be empty";

    public static final String MESSAGE_AGE = "Age can not be negative value";

}
