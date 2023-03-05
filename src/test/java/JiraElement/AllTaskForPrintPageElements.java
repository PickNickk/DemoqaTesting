package JiraElement;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AllTaskForPrintPageElements {
    public static SelenideElement allTasksResult = $x("//div[@class='results-count']");
}
