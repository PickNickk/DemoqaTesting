import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hook {

    @Before
    public void setUp() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/");
        System.out.println("Отрытие браузера и сайта");
    }

    @After
    public void close() {
        Selenide.closeWebDriver();
        System.out.println("Закрытие браузера");
    }
}
