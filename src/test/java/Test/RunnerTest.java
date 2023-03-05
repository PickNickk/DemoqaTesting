package Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefenition"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        tags = "@TEST"
)

public class RunnerTest {
}
