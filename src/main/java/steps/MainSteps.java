package steps;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 20.06.2018.
 */
public class MainSteps extends BaseSteps {

    @Step("Выбран пункт меню {0}")
    public void stepSelectMainMenu(String item, WebDriver driver) {
        new MainPage(driver).selectMainMenu(item, driver);
    }

    @Step("Выбран вид страхования {0}")
    public void stepSelectInsuranceMenu(String item, WebDriver driver) {
        new MainPage(driver).selectInsuranceMenu(item, driver);
    }
}
