import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.*;

public class Hook {

    @BeforeEach
    public void openAndAuthorization() {
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");

        SelenideElement login = $x("//input[@name='os_username']");
        login.click();
        login.sendKeys("shkambarny");

        SelenideElement pas = $x("//input[@name='os_password']");
        pas.click();
        pas.sendKeys("Qwerty123");

        $x("//input[@name='login']").click();
    }

    @AfterEach
    public void close() {
        Selenide.closeWebDriver();
    }
}
