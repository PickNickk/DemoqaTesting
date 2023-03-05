package JiraSteps;

import io.qameta.allure.Step;

import static JiraElement.AuthorizElements.*;

public class AutorizMethods {
    @Step("Вводится логин и пароль")
    public static void logIn(String username, String pass) {
        login.click();
        login.sendKeys(username);
        pas.click();
        pas.sendKeys(pass);
        submit.click();
    }
}
