package exceptions;

public class PermitLevelException extends IllegalAccessException{
    public static final String MESSAGE_PERMIT = "You do not have access level for this action";

    public PermitLevelException (String message, Throwable cause){

    }



}


