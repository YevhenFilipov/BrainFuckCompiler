package entity;

/**
 */
public class BrainFuckConstants {
    //Set here conformity of user code and this compiler commands
    public static final char SHIFT_RIGHT = '>';
    public static final char SHIFT_LEFT = '<';
    public static final char INCREMENT_VALUE = '+';
    public static final char DECREMENT_VALUE = '-';
    public static final char PRINT_TO_CONSOLE = '.';
    public static final char WHILE = '[';
    public static final char END = ']';

    //Set here id's of all commands
    public static final int ID_COMMENT = 0;
    public static final int ID_SHIFT_RIGHT = 1;
    public static final int ID_SHIFT_LEFT = 2;
    public static final int ID_INCREMENT_VALUE = 3;
    public static final int ID_DECREMENT_VALUE = 4;
    public static final int ID_PRINT_TO_CONSOLE = 5;
    public static final int ID_WHILE = 6;
    public static final int ID_END = 7;

    //Set here what SyntaxErrorBrainFuckCodeException will PrintStackTrace
    public static final String BAD_BRAIN_FUCK_CODE = "There are a non-closed loop block";

}
