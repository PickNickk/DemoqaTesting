package JiraSteps;

import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static JiraElement.ProjectTestPageElements.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectTestPageMethods {
    public static void clickTasks() {
        tasks.click();
    }

    public static void clickAllTasksAndFilters() {
        allTasksAndFilters.click();
    }

    public static String numberTest() {
        sleep(1000);
        return numberTestBug.getText();
    }

    public static String statusTask() {
        return statTask.getText();
    }

    public static String verAffected() {
        return verAffected.getText();
    }

    public static void clickInWork() {
        inWork.click();
        sleep(500);
    }

    public static void clickBusinessProcess() {
        sleep(1000);
        businessProcess.click();
    }

    public static void statusDone() {
        done.shouldBe(visible, Duration.ofSeconds(2)).click();
    }

    public static void donePageTable() {
        donePage.shouldBe(visible, Duration.ofSeconds(2)).click();
        sleep(500);
    }

    public static void statusComplete() {
        complete.shouldBe(visible, Duration.ofSeconds(2)).click();
        sleep(500);
    }

    public static String resultStatus() {
        return statusTask.getText();
    }
    public static String getMainPageProject(){
        return mainPageProject.getText();
    }
    public static void transitionToAllTasks() {
        clickTasks();
        clickAllTasksAndFilters();

    }
    public static void comparisonProject(){
        Assertions.assertEquals(getMainPageProject(),"Test");
    }
    public static void resultStat(String status){
        Assertions.assertEquals(resultStatus(),status);
    }
    public static void comparisonTask(){
        Assertions.assertEquals(numberTest(),"TEST-21967");
        Assertions.assertEquals(statusTask(),"СДЕЛАТЬ");
        Assertions.assertEquals(verAffected(),"Version 2.0");
    }
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
}
