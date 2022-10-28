import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Step("Устанавливаем интеграцию с Selenide")
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @Step("Открываем главную страницу")
    @BeforeEach
    void setUpEach(){
        open("https://github.com");
    }
}
