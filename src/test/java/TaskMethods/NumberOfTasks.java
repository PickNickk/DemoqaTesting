package TaskMethods;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class NumberOfTasks {
    public static void clickProjectMenu() {
        $x("//a[contains(text(),'Проекты')]").click();
    }

    public static void clickSoftware() {
        $x("//a[contains(@id,'software')]").click();
    }

    public static void clickTestProject() {
        $x("//a[@original-title='Test']").click();
    }

    public static void clickTasks() {
        $x("//span[contains(@class,'aui-iconfont-issues')]").click();
    }

    public static void clickAllTasksAndFilters() {
        $x("//a[contains(text(),'все задачи')]").click();
    }

    public static void clickAllTasks() {
         $x("//a[@title='Все задачи']").click();
    }
    public static void clickExport() {
        $x("//button[contains(@id,'81')]").click();
    }
    public static void clickForPrint() {
        $x("//a[contains(text(),'Для печати')]").click();
    }

    public static String numberTasks() {
        SelenideElement log = $x("//div[@class='showing']").shouldBe(visible, Duration.ofSeconds(2));
        return log.getText();
    }

    public static String numberTasksResult() {
        return $x("//div[@class='results-count']").getText();
    }
    public static String transitionToAllTasks() {
        clickProjectMenu();
        clickSoftware();
        clickTestProject();
        clickTasks();
        clickAllTasksAndFilters();
        clickAllTasks();
        String task = numberTasks();
        clickExport();
        clickForPrint();
        return task;
    }
    public static void comparisonNumberTasks(String task){
        Assertions.assertEquals(task.substring(5),numberTasksResult().substring(10,14));
    }
}
