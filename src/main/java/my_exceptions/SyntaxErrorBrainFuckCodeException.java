package my_exceptions;

/**
 */
public class SyntaxErrorBrainFuckCodeException extends IllegalArgumentException {

    public SyntaxErrorBrainFuckCodeException() {
    }

    public SyntaxErrorBrainFuckCodeException(String s) {
        super(s);
    }

    public SyntaxErrorBrainFuckCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SyntaxErrorBrainFuckCodeException(Throwable cause) {
        super(cause);
    }
}
