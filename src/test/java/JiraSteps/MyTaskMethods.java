package JiraSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import static JiraElement.MyTaskElements.*;
import static JiraSteps.ToolBarButtonsMethods.clickCreateButton;

public class MyTaskMethods {
    @Step("Выбор типа задачи")
    public static void choseTask(){
        choseBugTask.click();
        choseBugTask.sendKeys(Keys.BACK_SPACE);
        choseBugTask.sendKeys("Ошибка");
    }
    @Step("Название задачи")
    public static void themeName(){
        themeBug.click();
        themeBug.sendKeys("Баг сайта3119");
    }
    @Step("Описание задачи")
    public static void description(){
        descriptionBug.click();
        descriptionBug.sendKeys("Долгая обработка сайта после добавления нового юзера");
    }
    @Step("Выбор типа описания задачи")
    public static void clickText(){
        textButton.click();
    }
    @Step("Выбор в какой версии будет исправлена задача")
    public static void fixInVersions(){
        fixInVer.click();
    }
    @Step("Выбор приоритета задачи")
    public static void chosePriority(){
        priority.click();
        priority.sendKeys(Keys.BACK_SPACE);
        priority.sendKeys("High");
        priority.sendKeys(Keys.ENTER);
    }
    @Step("Описание окружения для задачи")
    public static void descriptionOfTheEnvironment(){
        environment.click();
        environment.sendKeys("Windows 10, Google chrome Версия 102.0.4951.62 (Официальная сборка), (64 бит).");
    }
    @Step("Выбор используемой версии")
    public static void versionsAffected(){
        verAffected.click();
    }
    @Step("Выбор доски Спринт")
    public static void choseSprint(){
        sprint.click();
        sprint.sendKeys("Доска Спринт 2");
    }
    @Step("Потверждение создания задачи")
    public static void submitCreate(){
        submit.click();
    }
    @Step("Вызов методов для исполнения создания задачи")
    public static void createTask(){
        clickCreateButton();
        choseTask();
        themeName();
        clickText();
        description();
        fixInVersions();
        chosePriority();
        descriptionOfTheEnvironment();
        versionsAffected();
        choseSprint();
        submitCreate();
    }
}
