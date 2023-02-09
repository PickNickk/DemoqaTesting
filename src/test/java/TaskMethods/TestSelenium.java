package TaskMethods;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

public class TestSelenium {

    public static void findTest() {
       SelenideElement log = $x("//input[@id='quickSearchInput']");
       log.click();
       log.sendKeys("TEST-21967");
       log.sendKeys(Keys.ENTER);
    }
    public static String numberTest() {
        return $x("//a[contains(text(),'TEST-21967')]").getText();
    }
    public static String statusTask() {
        return $x("//span[contains(@class,'medium')]").getText();
    }
    public static String versionsAffected() {
        return $x("//span[@title='Version 2.0 ']").getText();
    }

    public static void comparisonTask(){
        Assertions.assertEquals(numberTest(),"TEST-21967");
        Assertions.assertEquals(statusTask(),"СДЕЛАТЬ");
        Assertions.assertEquals(versionsAffected(),"Version 2.0");
    }



}
