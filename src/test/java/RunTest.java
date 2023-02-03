import org.junit.jupiter.api.Test;
import static TextBoxx.TextBox.*;

public class RunTest extends Hook {
    @Test
    public void textBoxTest() {
        userInformation();
        System.out.println(verificationName());
        comparison();
    }
    @Test
    public void notCorrectTextBoxTest() {
        userInformation();
        System.out.println(verificationName());
        notCorrectComparison();
    }
}

