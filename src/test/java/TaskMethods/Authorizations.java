package TaskMethods;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import static com.codeborne.selenide.Selenide.*;
public class Authorizations {

    public static void clickMenuProfile(){
        $x("//span[contains(@class,'inner')]").click();
    }

    public static void clickProfile(){
        $x("//a[contains(text(),'Профиль')]").click();
    }

    public static SelenideElement getUser(String user){
        return  $x("//dd[contains(text(),'"+user+"')]");
    }

    public static void openProfile(){
        clickMenuProfile();
        clickProfile();
    }

    public static void comparisonUser(String us){
        Assertions.assertEquals(getUser(us).getText(), us);
    }

}
