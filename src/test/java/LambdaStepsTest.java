import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepsTest extends BaseTest{
    private static final String REPOSITORY = "FkkfRf/HW_15_AllureReport";
    private static final int ISSUE = 2;

    @Test
    @Feature("For get report with Allure to Lambda #2 Issue в репозитории")
    @Story("Проверка выбора Issue")
    @Owner("FkkffRf")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "HW_15_AllureReport", url = "https://github.com/FkkfRf/HW_15_AllureReport/issues")
    @DisplayName("Выбор Issue для тестирования Lambda Steps")
    public void testLambdaStep() {
        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Кликаем по ссылке репозитория " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Открываем таб Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие Issue с номером " + ISSUE, () -> {
            $(withText("#" + ISSUE)).should(Condition.exist);
        });
    }
}
