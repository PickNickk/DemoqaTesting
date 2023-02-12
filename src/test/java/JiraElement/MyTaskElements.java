package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MyTaskElements {
    public static SelenideElement choseBugTask = $x("//input[@id='issuetype-field']");
    public static SelenideElement themeBug = $x("//input[@name='summary']");
    public static SelenideElement descriptionBug = $x("//textarea[@id='description']");
    public static SelenideElement textButton = $x("//button[contains(text(),'Текст')]");
    public static SelenideElement fixInVer = $x("(//option[@value='10001'])[1]");
    public static SelenideElement priority = $x("//input[@id='priority-field']");
    public static SelenideElement environment = $x("//textarea[@id='environment']");
    public static SelenideElement verAffected = $x("(//option[@value='10000'])[2]");
    public static SelenideElement sprint = $x("//input[contains(@id,'4-field')]");
    public static SelenideElement submit = $x("//input[@name='Edit']");
}
