package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectTestFilterElements {
    public static SelenideElement allTasksFilter = $x("//a[@title='Все задачи']");
    public static SelenideElement exportButton = $x("//button[contains(@id,'81')]");
    public static SelenideElement forPrint = $x("//a[contains(text(),'Для печати')]");
    public static SelenideElement allTaskInfo = $x("//div[@class='showing']");
    public static SelenideElement moreMenu = $x("//button[text()='Больше']");
    public static SelenideElement moreSearch = $x("//input[@id='criteria-input']");
    public static SelenideElement currentUser = $x("//label[@title='Текущий пользователь']");
}
