import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest extends BaseTest{
    private static final String REPOSITORY = "FkkfRf/HW_15_AllureReport";
    private static final int ISSUE = 3;
    @Test
    @Feature("'For get report with Allure to Annotation #3' Issue в репозитории")
    @Story("Проверка выбора Issue")
    @Owner("Fkkff.Rf")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HW_15_AllureReport", url = "https://github.com/FkkfRf/HW_15_AllureReport/issues")
    @DisplayName("Выбор Issue для тестирования Annotation Steps")
    public void testAnnotatedStep() {
        WebSteps steps = new WebSteps();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber(ISSUE);

    }
}
