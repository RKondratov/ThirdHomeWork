package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by Кондратов on 19.06.2018.
 */
public class TravelAndBuyPage {

    @FindBy(xpath = "//a[@href='https://online.sberbankins.ru/store/vzr/index.html#/viewCalc']")
    WebElement button;

    @FindBy(xpath = "//h3[text()='Страхование путешественников']")
    WebElement title;

    public TravelAndBuyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void pushTheButton() {
        button.click();
    }

    public void checkTheTitle(){
        assertEquals(title.getText(),"Страхование путешественников");
    }
}
