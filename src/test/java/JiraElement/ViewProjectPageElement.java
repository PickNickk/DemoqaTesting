package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ViewProjectPageElement {
    public static SelenideElement
            testProject = $x("//a[@original-title='Test']");
}
