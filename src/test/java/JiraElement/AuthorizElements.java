package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class AuthorizElements {
    public static SelenideElement login = $x("//input[@name='os_username']");
    public static SelenideElement pas = $x("//input[@name='os_password']");
    public static SelenideElement submit =$x("//input[@name='login']");
}
