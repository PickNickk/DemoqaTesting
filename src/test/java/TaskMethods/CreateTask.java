package TaskMethods;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CreateTask {

    public static void clickCreateButton(){
        $x("//a[contains(@class,'create-issue')]").click();
    }
    public static void choseTask(){
        SelenideElement log = $x("//input[@id='issuetype-field']");
        log.click();
        log.shouldBe(visible, Duration.ofSeconds(1));
        log.sendKeys(Keys.BACK_SPACE);
        log.sendKeys("Ошибка");
    }
    public static void themeName(){
        SelenideElement log = $x("//input[@name='summary']");
        log.click();
        log.sendKeys("Баг сайта3119");
    }

    public static void description(){
        SelenideElement log = $x("//textarea[@id='description']");
        log.click();
        log.sendKeys("Долгая обработка сайта после добавления нового юзера");
    }
    public static void clickText(){
        SelenideElement log = $x("//button[contains(text(),'Текст')]");
        log.click();
    }
    public static void fixInVersions(){
        $x("(//option[@value='10001'])[1]").click();
    }
    public static void clickPriority(){
        $x("//input[@id='priority-field']").click();
    }
    public static void chosePriority(){
        SelenideElement log = $x("//a[text()='High']");
        log.hover();
        log.click();
    }

    public static void environment(){
        SelenideElement log = $x("//textarea[@id='environment']");
        log.click();
        log.sendKeys("Windows 10, Google chrome Версия 102.0.4951.62 (Официальная сборка), (64 бит).");
    }
    public static void versionsAffected(){
        $x("(//option[@value='10000'])[2]").click();
    }
    public static void addTask() {
        SelenideElement log = $x("//textarea[@id='issuelinks-issues-textarea']");
        log.click();
        log.sendKeys("TEST-21967");
    }
    public static void clickSprint(){
        $x("//div[@id='customfield_10104-single-select']").click();
    }
    public static void choseSprint(){
        SelenideElement log = $x("//a[text()='Доска Спринт 2']");
        log.hover();
        log.click();
    }
    public static void submitCreate(){
        $x("//input[@id='create-issue-submit']").click();
    }
    public static void findMyTask() {
        SelenideElement log = $x("//input[@id='quickSearchInput']");
        log.click();
        log.sendKeys("Баг сайта3119");
        log.sendKeys(Keys.ENTER);
    }
    public static void clickInWork(){
        $x("//span[text()='В работе']").click();
    }
    public static void clickBusinessProcess()  {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        $x("//span[text()='Бизнес-процесс']").click();
    }
    public static void done() {
       $x("//span[text()='Исполнено']").shouldBe(visible, Duration.ofSeconds(2)).hover().click();
    }
    public static void donePageTable() {
        $x("//input[@value='Исполнено']").shouldBe(visible, Duration.ofSeconds(2)).hover().click();
    }
    public static void complete() {
        $x("//span[text()='Выполнено']").shouldBe(visible, Duration.ofSeconds(2)).hover().click();
    }
    public static void transitionCreateATask(){
        clickCreateButton();
        choseTask();
        themeName();
        clickText();
        description();
        fixInVersions();
        clickPriority();
        chosePriority();
        environment();
        versionsAffected();
        addTask();
        clickSprint();
        choseSprint();
        submitCreate();
        findMyTask();
        comparisonMyTask(resultStatusNeedDo(),"СДЕЛАТЬ");
        clickInWork();
        comparisonMyTask(resultStatusInWork(),"В РАБОТЕ");
        clickBusinessProcess();
        done();
        donePageTable();
        comparisonMyTask(resultStatusDone(),"РЕШЕННЫЕ");
        clickBusinessProcess();
        complete();
        comparisonMyTask(resultStatusComplete(),"ГОТОВО");
    }

    public static String resultStatusNeedDo(){
        return $x("(//span[text()='Сделать'])[1]").getText();
    }
    public static String resultStatusInWork(){
        return $x("(//span[text()='В работе'])[2]").getText();
    }
    public static String resultStatusDone(){
        return $x("(//span[text()='Решенные'])[1]").getText();

    }public static String resultStatusComplete(){
        return $x("(//span[text()='Готово'])[1]").getText();
    }
    public static void comparisonMyTask(String actual,String expected){
        Assertions.assertEquals(expected,actual);
    }
}
