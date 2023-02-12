package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static JiraSteps.AutorizMethods.logIn;
import static com.codeborne.selenide.Selenide.*;

public class Hook {
    @BeforeEach
    public void openAndAuthorization() {
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        logIn("shkambarny","Qwerty123");
    }

    @AfterEach
    public void close() {
        Selenide.closeWebDriver();
    }
}
