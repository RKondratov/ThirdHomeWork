package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Кондратов on 17.06.2018.
 */
public class PolicyMakerPage {

    @FindBy(xpath = "//input[@name='insured0_surname']")
    WebElement insuredSurname;

    @FindBy(xpath = "//input[@name='insured0_name']")
    WebElement insuredName;

    @FindBy(xpath = "//input[@name='insured0_birthDate']")
    WebElement insuredBirthDate;

    @FindBy(xpath = "//input[@name='surname']")
    WebElement surname;

    @FindBy(xpath = "//input[@name='name']")
    WebElement name;

    @FindBy(xpath = "//input[@name='middlename']")
    WebElement middlename;

    @FindBy(xpath = "//input[@name='birthDate']")
    WebElement birthDate;

    @FindBy(xpath = "//fieldset[@class='b-form-fieldset-splash b-form-margtop-fieldset']")
    WebElement sex;

    @FindBy(xpath = "//input[@name='passport_series']")
    WebElement passportSeries;

    @FindBy(xpath = "//input[@name='passport_number']")
    WebElement passportNumber;

    @FindBy(xpath = "//textarea[@name='issuePlace']")
    WebElement issuePlace;

    @FindBy(xpath = "//input[@name='issueDate']")
    WebElement issueDate;

    @FindBy(xpath = "//div[@class='b-button-block-center']")
    WebElement button;

    public PolicyMakerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void setValueOfElement(String text, String value) {
        switch (text) {
            case "insuredSurname":
                fillField(insuredSurname, value);
                break;
            case "insuredName":
                fillField(insuredName, value);
                break;
            case "insuredBirthDate":
                fillField(insuredBirthDate, value);
                break;
            case "surname":
                fillField(surname, value);
                break;
            case "name":
                fillField(name, value);
                break;
            case "middlename":
                fillField(middlename, value);
                break;
            case "birthDate":
                fillField(birthDate, value);
                break;
            case "passportSeries":
                fillField(passportSeries, value);
                break;
            case "passportNumber":
                fillField(passportNumber, value);
                break;
            case "issuePlace":
                fillField(issuePlace, value);
                break;
            case "issueDate":
                fillField(issueDate, value);
                break;
            case "sex":
                sex.findElement(By.xpath(".//input[@name='" + value + "']")).click();
                break;
        }
    }

    public void pushButton(String value) {
        button.findElement(By.xpath(".//*[text()='" + value + "']")).click();
    }

    public  String getValueOfElement(String text) {
        switch (text) {
            case "insuredSurname":
                text = insuredSurname.getAttribute("value");
                break;
            case "insuredName":
                text = insuredName.getAttribute("value");
                break;
            case "insuredBirthDate":
                text = insuredBirthDate.getAttribute("value");
                break;
            case "surname":
                text = surname.getAttribute("value");
                break;
            case "name":
                text = name.getAttribute("value");
                break;
            case "middlename":
                text = middlename.getAttribute("value");
                break;
            case "birthDate":
                text = birthDate.getAttribute("value");
                break;
            case "passportSeries":
                text = passportSeries.getAttribute("value");
                break;
            case "passportNumber":
                text = passportNumber.getAttribute("value");
                break;
            case "issuePlace":
                text = issuePlace.getAttribute("value");
                break;
            case "issueDate":
                text = issueDate.getAttribute("value");
                break;
            case "cont":
                text = button.findElement(By.xpath("//div[@ng-show='tryNext && myForm.$invalid']")).getText();
                break;
        }
        return text;
    }

    private void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
