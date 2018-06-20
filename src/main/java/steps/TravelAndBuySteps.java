package steps;

import pages.TravelAndBuyPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 20.06.2018.
 */
public class TravelAndBuySteps extends BaseSteps {

    @Step("Проверили заголовок")
    public void stepCheckTheTitle() {
        new TravelAndBuyPage(driver).checkTheTitle();
    }

    @Step("Выполнено нажатие на кнопку \"Оформить онлай\"")
    public void stepPushTheButton() {
        new TravelAndBuyPage(driver).pushTheButton();
    }
}
