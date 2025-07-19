package Models.exceptions;

import java.io.Serial;

public class DomainExceptions extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainExceptions(String message) {
        super(message);
    }
}
