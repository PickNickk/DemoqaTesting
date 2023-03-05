package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class PageUserElements {
    public static SelenideElement getUser(String user){
        return  $x("//dd[contains(text(),'"+user+"')]");
    }
    public static SelenideElement userInfo = $x("//a[contains(@id,'up_user')]");
}
