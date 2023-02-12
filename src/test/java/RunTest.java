import Hooks.Hook;
import org.junit.jupiter.api.Test;
import static JiraSteps.MyTaskMethods.*;
import static JiraSteps.PageUserMethods.*;
import static JiraSteps.ProjectTestFilterMethods.*;
import static JiraSteps.ProjectTestPageMethods.*;
import static JiraSteps.ToolBarButtonsMethods.*;
import static JiraSteps.ViewProjectPageMethods.clickTestProject;

public class RunTest extends Hook {
    @Test
    public void authorizationTest() {
        openProfile();
        comparisonUser("shkambarny");
    }
    @Test
    public void openPageProjectTest() {
        transitionToProject();
        clickTestProject();
        comparisonProject();
    }
    @Test
    public void numberOfTasksTest()  {
        transitionToProject();
        clickTestProject();
        transitionToAllTasks();
        comparisonNumberTasks(getNumberOfTask());
    }
    @Test
    public void taskSeleniumTest()  {
        findTestBug();
        comparisonTask();
    }
    @Test
    public void createTaskTest()  {
        createTask();
        searchMyTask();
        checkingTaskStatuses();
    }
}

