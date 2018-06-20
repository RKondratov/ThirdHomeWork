package util;

import org.junit.runner.notification.Failure;
import ru.yandex.qatools.allure.junit.AllureRunListener;
import steps.BaseSteps;

/**
 * Created by Кондратов on 20.06.2018.
 */
public class AllureListener extends AllureRunListener {
    @Override
    public void testFailure(Failure failure){
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }
}
