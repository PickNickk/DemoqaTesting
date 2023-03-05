package JiraSteps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static JiraElement.ProjectTestFilterElements.*;
import static JiraSteps.AllTaskForPrintPageMethods.*;
import static JiraSteps.ToolBarButtonsMethods.*;
import static JiraSteps.ToolBarButtonsMethods.clickSearchTask;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectTestFilterMethods {
    @Step("Выбор пункта \"Все задачи\"")
    public static void clickAllTasks() {
        allTasksFilter.click();
        sleep(1000);
    }
    @Step("Открытие меню \"Экспорт\"")
    public static void clickExport() {
        exportButton.click();
    }
    @Step("Выбор пункта \"Для печати\"")
    public static void clickForPrint() {
        forPrint.click();
    }
    @Step("Открытие меню \"Больше\"")
    public static void clickMoreButton() {
        moreMenu.click();
    }
    @Step("В открывшемся меню \"Больше\" печатаем: \"Автор задачи\", жмем Enter ")
    public static void clickSearchField() {
        moreSearch.click();
        moreSearch.sendKeys("Автор задачи");
        moreSearch.sendKeys(Keys.ENTER);
    }
    @Step("В открывшемся меню: \"Автор задачи\" выбираем пункт: \"Текущий пользователь\"")
    public static void clickCurrentUser() {
        currentUser.click();
    }
    @Step("Вызов методов для поиска задачи текущего пользователя")
    public static void searchMyTask() {
        clickTask();
        clickSearchTask();
        clickMoreButton();
        clickSearchField();
        clickCurrentUser();
    }
    @Step("Вызов методов для перехода на страницу \"Для печати\" и сранения текста: количество задач")
    public static String getNumberOfTask(){
        clickAllTasks();
        String task = numberTasks();
        clickExport();
        clickForPrint();
        return task;
    }
    @Step("Возвращения текста с количеством задач на странице проекта")
    public static String numberTasks() {
        return allTaskInfo.getText();
    }
    @Step("Сравние количество задач на странице \"Для печати\"")
    public static void comparisonNumberTasks(String task){
        Assertions.assertEquals(task.substring(5),numberTasksResult().substring(10,14));
    }
}
