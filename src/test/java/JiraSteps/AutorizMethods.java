package JiraSteps;

import static JiraElement.AuthorizElements.*;

public class AutorizMethods {

    public static void logIn(String username, String pass) {
        login.click();
        login.sendKeys(username);
        pas.click();
        pas.sendKeys(pass);
        submit.click();
    }
}
