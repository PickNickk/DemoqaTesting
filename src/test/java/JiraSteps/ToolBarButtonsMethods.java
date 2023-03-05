package JiraSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static JiraElement.ToolBarButtonsElement.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ToolBarButtonsMethods {
    @Step("Открытие: \"Меню профиля\"")
    public static void clickMenuProfile(){
        menuProfile.click();
    }
    @Step("Выбор пункта: \"Профиль\"")
    public static void clickProfile(){
        profile.click();
        sleep(1000);
    }
    @Step("Открытие меню: \"Проекты\"")
    public static void clickProjectMenu(){
        projectMenu.click();
    }
    @Step("Выбор пункта: \"Software\"")
    public static void clickSoftware(){
        software.click();
    }
    @Step("Вводим текст {taskName} в поле поиска и жмем Enter")
    public static void findTestBug(String taskName) {
        searchField.click();
        searchField.sendKeys(taskName);
        searchField.sendKeys(Keys.ENTER);
    }
    @Step("Выбор пункта: \"Создать\"")
    public static void clickCreateButton(){
        createButton.click();
    }
    @Step("Открытие меню: \"Задачи\"")
    public static void clickTask() {
        taskButton.click();
    }
    @Step("Выбор пункта: \"Поиск задач\"")
    public static void clickSearchTask(){
        sleep(1000);
        searchTask.click();
    }
    @Step("Вызов методов для открытия страницы профиля")
    public static void openProfile(){
        clickMenuProfile();
        clickProfile();
    }
    @Step("Вызов методов для перехода на страницу с проектами")
    public static void transitionToProject(){
        clickProjectMenu();
        clickSoftware();
    }
}
