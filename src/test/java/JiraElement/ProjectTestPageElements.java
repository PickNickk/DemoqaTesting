package JiraElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ProjectTestPageElements {
    public static SelenideElement tasks = $x("//span[contains(@class,'aui-iconfont-issues')]");
    public static SelenideElement allTasksAndFilters = $x("//a[contains(text(),'все задачи и фильтры')]");
    public static SelenideElement numberTestBug = $x("//a[contains(text(),'TEST-21967')]");
    public static SelenideElement statTask = $x("//span[contains(@class,'medium')]");
    public static SelenideElement verAffected = $x("//span[@title='Version 2.0 ']");
    public static SelenideElement inWork = $x("//a[@id='action_id_21']");
    public static SelenideElement businessProcess = $x("//span[text()='Бизнес-процесс']");
    public static SelenideElement done = $x("//span[text()='Исполнено']");
    public static SelenideElement donePage = $x("//input[@value='Исполнено']");
    public static SelenideElement complete = $x("//span[text()='Выполнено']");
    public static SelenideElement statusTask = $x("//span[@id='status-val']");
    public static SelenideElement mainPageProject = $x("//a[@id='project-name-val']");

}
