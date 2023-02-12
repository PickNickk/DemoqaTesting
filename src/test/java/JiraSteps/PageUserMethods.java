package JiraSteps;

import org.junit.jupiter.api.Assertions;
import static JiraElement.PageUserElements.*;

public class PageUserMethods {

    public static void comparisonUser(String user){
        Assertions.assertEquals(getUser(user).getText(), user);
    }
}
