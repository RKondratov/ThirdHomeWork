package steps;

import org.openqa.selenium.WebDriver;
import pages.TravelInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 20.06.2018.
 */
public class TravelInsuranceSteps extends BaseSteps {

    @Step("Выбрана сумма страховой защиты {0} тысяч евро")
    public void stepChoosePriceAndPushButton(String value){
        new TravelInsurancePage(driver).choosePriceAndPushButton(value);
    }
}
