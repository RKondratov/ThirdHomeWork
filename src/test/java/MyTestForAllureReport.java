import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Кондратов on 20.06.2018.
 */
public class MyTestForAllureReport extends BaseSteps {

    @Test
    @Title("Страхование в сбербанке")
    public void testSberbankPage(){
        MainSteps mainSteps = new MainSteps();
        PolicyMakerSteps policyMakerSteps = new PolicyMakerSteps();
        TravelAndBuySteps travelAndBuySteps = new TravelAndBuySteps();
        TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("insuredName","Arthas");
        testData.put("insuredSurname", "Menethil");
        testData.put("insuredBirthDate","22.06.1941");
        testData.put("surname", "Иванова");
        testData.put("name", "Ивана");
        testData.put("middlename", "Иванович");
        testData.put("birthDate", "09.05.1945");
        testData.put("passportSeries", "9999");
        testData.put("passportNumber", "999999");
        testData.put("issueDate", "12.12.2012");
        testData.put("issuePlace", "Azeroth WoW");

        mainSteps.stepSelectMainMenu("Страхование", driver);
        mainSteps.stepSelectInsuranceMenu("Путешествия и покупки", driver);
        travelAndBuySteps.stepCheckTheTitle();
        travelAndBuySteps.stepPushTheButton();

        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs2.get(1));

        travelInsuranceSteps.stepChoosePriceAndPushButton("35");
        policyMakerSteps.stepSetValueOfElements(testData);
        policyMakerSteps.stepSetValueOfElement("sex", "female");
        policyMakerSteps.stepPushButton("Продолжить");
        policyMakerSteps.stepCheckFillFields(testData);
        policyMakerSteps.stepGetValueOfElement("cont", "Заполнены не все обязательные поля");
    }
}
