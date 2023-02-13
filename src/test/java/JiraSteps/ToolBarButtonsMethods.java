package JiraSteps;

import org.openqa.selenium.Keys;
import static JiraElement.ToolBarButtonsElement.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ToolBarButtonsMethods {
    public static void clickMenuProfile(){
        menuProfile.click();
    }
    public static void clickProfile(){
        profile.click();
    }
    public static void clickProjectMenu(){
        projectMenu.click();
    }
    public static void clickSoftware(){
        software.click();
    }
    public static void findTestBug(String taskName) {
        searchField.click();
        searchField.sendKeys(taskName);
        searchField.sendKeys(Keys.ENTER);
    }

    public static void clickCreateButton(){
        createButton.click();
    }
    public static void clickSearchTask(){
        sleep(1000);
        searchTask.click();
    }
    public static void clickTask() {
        taskButton.click();
    }
    public static void openProfile(){
        clickMenuProfile();
        clickProfile();
    }
    public static void transitionToProject(){
        clickProjectMenu();
        clickSoftware();
    }
}
