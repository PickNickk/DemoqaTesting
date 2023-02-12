package JiraSteps;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import static JiraElement.ProjectTestFilterElements.*;
import static JiraSteps.AllTaskForPrintPageMethods.numberTasksResult;
import static JiraSteps.ToolBarButtonsMethods.*;
import static JiraSteps.ToolBarButtonsMethods.clickSearchTask;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectTestFilterMethods {
    public static void clickAllTasks() {
        allTasksFilter.click();
        sleep(1000);
    }
    public static void clickExport() {
        exportButton.click();
    }
    public static void clickForPrint() {
        forPrint.click();
    }
    public static void clickMoreButton() {
        moreMenu.click();
    }
    public static void clickSearchField() {
        moreSearch.click();
        moreSearch.sendKeys("Автор задачи");
        moreSearch.sendKeys(Keys.ENTER);
    }
    public static void clickCurrentUser() {
        currentUser.click();
    }
    public static String numberTasks() {
        return allTaskInfo.getText();
    }
    public static void comparisonNumberTasks(String task){
        Assertions.assertEquals(task.substring(5),numberTasksResult().substring(10,14));
    }
    public static String getNumberOfTask(){
        clickAllTasks();
        String task = numberTasks();
        clickExport();
        clickForPrint();
        return task;
    }
    public static void searchMyTask() {
        clickTask();
        clickSearchTask();
        clickMoreButton();
        clickSearchField();
        clickCurrentUser();
    }
}
