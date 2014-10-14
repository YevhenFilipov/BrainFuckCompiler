import entity.BrainFuckData;
import my_exceptions.SyntaxErrorBrainFuckCodeException;
import services.BrainFuckCompiler;

/**
 */
public class Test {
    public static void main(String[] args) {

        final String helloWorld = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++\n" +
                " .>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.\n" +
                " ------.--------.>+.>.";

        BrainFuckData data = new BrainFuckData();
        BrainFuckCompiler compiler = new BrainFuckCompiler();
        try {
            compiler.execute(data, helloWorld);
        } catch (SyntaxErrorBrainFuckCodeException e) {
            e.printStackTrace();
        }
    }
}
