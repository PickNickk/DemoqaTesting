package JiraSteps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;

import static JiraElement.ProjectTestPageElements.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectTestPageMethods {
    @Step("Выбор пункта \"Задачи\" в проекте Test")
    public static void clickTasks() {
        tasks.click();
    }
    @Step("Выбор пункта \"Посмотреть все задачи и фильтры\"")
    public static void clickAllTasksAndFilters() {
        allTasksAndFilters.click();
    }
    @Step("Выбор статуса \"В работе\"")
    public static void clickInWork() {
        inWork.click();
        sleep(1000);
    }
    @Step("Открытие меню \"Бизнес-процесс\"")
    public static void clickBusinessProcess() {
        sleep(1000);
        businessProcess.click();
    }
    @Step("Выбор статуса \"Исполено\"")
    public static void statusDone() {
        done.shouldBe(visible, Duration.ofSeconds(2)).click();
    }
    @Step("Потверждение исполения")
    public static void donePageTable() {
        donePage.shouldBe(visible, Duration.ofSeconds(2)).click();
        sleep(1000);
    }
    @Step("Выбор статуса \"Выполено\"")
    public static void statusComplete() {
        complete.shouldBe(visible, Duration.ofSeconds(2)).click();
        sleep(1000);
    }
    @Step("Вызов методов для открытия пункта: \"Посмотреть все задачи и фильтры\"")
    public static void transitionToAllTasks() {
        clickTasks();
        clickAllTasksAndFilters();
    }
    @Step("Вызов методов для исполения проверки статусов задачи")
    public static void checkingTaskStatuses(){
        resultStat("СДЕЛАТЬ");
        clickInWork();
        resultStat("В РАБОТЕ");
        clickBusinessProcess();
        statusDone();
        donePageTable();
        resultStat("РЕШЕННЫЕ");
        clickBusinessProcess();
        statusComplete();
        resultStat("ГОТОВО");
    }
    @Step("Возвращение текста с результатами статуса")
    public static String resultStatus() {
        return statusTask.getText();
    }
    @Step("Возвращение текста с название проекта: Test")
    public static String getMainPageProject(){
        return mainPageProject.getText();
    }
    @Step("Возвращение текста задачи: TEST-21967")
    public static String numberTest() {
        sleep(1000);
        return numberTestBug.getText();
    }
    @Step("Возвращение текста статуса задачи: СДЕЛАТЬ")
    public static String statusTask() {
        return statTask.getText();
    }
    @Step("Возвращение текста затронутой версии: Version 2.0")
    public static String verAffected() {
        return verAffected.getText();
    }
    @Step("Сравнение название проекта")
    public static void comparisonProject(){
        Assertions.assertEquals(getMainPageProject(),"Test");
    }
    @Step("Сравнение статусов созданной задачи")
    public static void resultStat(String status){
        Assertions.assertEquals(resultStatus(),status);
    }
    @Step("Сравнение данных задачи: TEST-21967")
    public static void comparisonTask(){
        Assertions.assertEquals(numberTest(),"TEST-21967");
        Assertions.assertEquals(statusTask(),"СДЕЛАТЬ");
        Assertions.assertEquals(verAffected(),"Version 2.0");
    }
}
