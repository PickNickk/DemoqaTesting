package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ToolBarButtonsElement {
    public static SelenideElement menuProfile = $x("//span[contains(@class,'inner')]");
    public static SelenideElement profile = $x("//a[contains(text(),'Профиль')]");
    public static SelenideElement projectMenu = $x("//a[contains(text(),'Проекты')]");
    public static SelenideElement software = $x("//a[contains(@id,'software')]");
    public static SelenideElement searchField = $x("//input[@id='quickSearchInput']");
    public static SelenideElement taskButton = $x("//a[contains(@title,'Поиск')]");
    public static SelenideElement searchTask = $x("//a[text()='Поиск задач']");
    public static SelenideElement createButton = $x("//a[contains(@class,'create-issue')]");
}
