import Hooks.Hook;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static JiraSteps.MyTaskMethods.*;
import static JiraSteps.PageUserMethods.*;
import static JiraSteps.ProjectTestFilterMethods.*;
import static JiraSteps.ProjectTestPageMethods.*;
import static JiraSteps.ToolBarButtonsMethods.*;
import static JiraSteps.ViewProjectPageMethods.*;

public class RunTest extends Hook {

    @Test
    @DisplayName("Авторизация пользователя")
    @Description("Происходит авторизация и сравнение пользователя")
    public void authorizationTest() {
        openProfile();
        clickInfoUser();
        comparisonUser("shkambarny");
    }
    @Test
    @DisplayName("Проект Test")
    @Description("Происходит открытие и сравнение проекта: Test")
    public void openPageProjectTest() {
        transitionToProject();
        clickTestProject();
        comparisonProject();
    }
    @Test
    @DisplayName("Количество задач")
    @Description("Происходит поиск и сранение всех созданных задач на сайте")
    public void numberOfTasksTest()  {
        transitionToProject();
        clickTestProject();
        transitionToAllTasks();
        comparisonNumberTasks(getNumberOfTask());
    }
    @Test
    @DisplayName("Поиск задачи")
    @Description("Происходит поиск и сравнение задачи: TEST-21967")
    public void taskSeleniumTest()  {
        findTestBug("TEST-21967");
        comparisonTask();
    }
    @Test
    @DisplayName("Создание задачи")
    @Description("Происходит создание и проверка статусов задачи")
    public void createTaskTest()  {
        createTask();
        searchMyTask();
        checkingTaskStatuses();
    }
}
