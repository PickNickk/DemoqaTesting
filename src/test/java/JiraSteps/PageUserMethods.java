package JiraSteps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static JiraElement.PageUserElements.*;

public class PageUserMethods {
    @Step("Выбор пункта \"Сводка\"")
    public static void clickInfoUser(){
        userInfo.click();
    }
    @Step("Сравнение имя полльзователя {user}")
    public static void comparisonUser(String user){
        Assertions.assertEquals(getUser(user).getText(), user);
    }
}
