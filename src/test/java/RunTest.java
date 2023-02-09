import org.junit.jupiter.api.Test;
import static TaskMethods.Authorizations.*;
import static TaskMethods.CreateTask.*;
import static TaskMethods.OpenTestProject.*;
import static TaskMethods.NumberOfTasks.*;
import static TaskMethods.TestSelenium.*;
public class RunTest extends Hook {
    @Test
    public void authorizationTest() {
        openProfile();
        comparisonUser("shkambarny");
    }
    @Test
    public void openPageProjectTest() {
        transitionToProject();
        comparisonProject();
    }
    @Test
    public void numberOfTasksTest()  {
        String task = transitionToAllTasks();
        comparisonNumberTasks(task);
    }
    @Test
    public void taskSeleniumTest()  {
        findTest();
        comparisonTask();
    }
    @Test
    public void createTaskTest()  {
        transitionCreateATask();
    }
}

