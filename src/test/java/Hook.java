import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class Hook {

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/");
        System.out.println("Отрытие браузера и сайта");
    }

    @AfterEach
    public void close() {
        Selenide.closeWebDriver();
        System.out.println("Закрытие браузера");
    }
}
