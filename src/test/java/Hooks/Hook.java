package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static JiraSteps.AutorizMethods.logIn;
import static com.codeborne.selenide.Selenide.*;

public class Hook {
    @BeforeEach
    @Step("Открытие страницы и авторизация пользователя")
    public void openAndAuthorization() {
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        logIn("shkambarny","Qwerty123");
    }
    @BeforeAll
    public static void before(){
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(false)
        );
    }
    @AfterEach
    @Step("Закрытие браузера")
    public void close() {
        Selenide.closeWebDriver();
    }
}
