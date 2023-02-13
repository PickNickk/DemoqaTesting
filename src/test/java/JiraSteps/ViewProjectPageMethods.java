package JiraSteps;

import static JiraElement.ViewProjectPageElement.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ViewProjectPageMethods {
    public static void clickTestProject(){
        testProject.click();
        sleep(500);
    }
}
