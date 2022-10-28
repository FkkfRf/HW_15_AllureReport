import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class SelenideTest extends BaseTest {

    private static final String REPOSITORY = "FkkfRf/HW_15_AllureReport";
    private static final int ISSUE = 4;

    @Test
    @DisplayName("Выбор Issue для тестирования c Selenide")
    public void issueSearch() {
        Allure.getLifecycle().updateTestCase(
                t -> t.setName("Выбор Issue для тестирования c Selenide")
        );
        Allure.feature("'For get report with Allure to Selenide #4' Issue в репозитории");
        Allure.story("Проверка выбора Issue");
        Allure.label("owner", "Fkkf.Rf");
        Allure.label("severity", SeverityLevel.NORMAL.value());
        Allure.link("HW_15_AllureReport", "https://github.com/FkkfRf/HW_15_AllureReport/issues");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys(REPOSITORY);
        $(".header-search-input").submit();

        $(linkText(REPOSITORY)).click();
        $("#issues-tab").click();
        $(withText("#" + ISSUE)).should(Condition.exist);
    }

}
