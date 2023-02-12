package JiraSteps;

import org.openqa.selenium.Keys;
import static JiraElement.MyTaskElements.*;
import static JiraSteps.ToolBarButtonsMethods.clickCreateButton;

public class MyTaskMethods {
    public static void choseTask(){
        choseBugTask.click();
        choseBugTask.sendKeys(Keys.BACK_SPACE);
        choseBugTask.sendKeys("Ошибка");
    }
    public static void themeName(){
        themeBug.click();
        themeBug.sendKeys("Баг сайта3119");
    }
    public static void description(){
        descriptionBug.click();
        descriptionBug.sendKeys("Долгая обработка сайта после добавления нового юзера");
    }
    public static void clickText(){
        textButton.click();
    }
    public static void fixInVersions(){
        fixInVer.click();
    }
    public static void chosePriority(){
        priority.click();
        priority.sendKeys(Keys.BACK_SPACE);
        priority.sendKeys("High");
        priority.sendKeys(Keys.ENTER);
    }
    public static void descriptionOfTheEnvironment(){
        environment.click();
        environment.sendKeys("Windows 10, Google chrome Версия 102.0.4951.62 (Официальная сборка), (64 бит).");
    }
    public static void versionsAffected(){
        verAffected.click();
    }
    public static void choseSprint(){
        sprint.click();
        sprint.sendKeys("Доска Спринт 2");
    }
    public static void submitCreate(){
        submit.click();
    }
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
