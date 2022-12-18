package exceptions;

import java.io.IOException;

public class ScannerException extends IOException {
    public ScannerException(String description) {
        super(description);
    }
}
