package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Кондратов on 19.06.2018.
 */
public class MainPage {
    @FindBy(xpath = "//div[@class='kit-col kit-col_xs_10 lg-menu__col']")
    WebElement mainMenu;

    @FindBy(xpath = "//li[position()=6][@class='lg-menu__item']/div[@class='lg-menu__sub']")
    WebElement insurance;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectMainMenu(String item, WebDriver driver) {
        WebElement element = mainMenu.findElement(By.xpath(".//*[text() = '" + item + "']"));
        new Actions(driver).moveToElement(element).build().perform();
    }

    public void selectInsuranceMenu(String item, WebDriver driver) {
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(insurance.findElement(By.xpath("//*[contains(text(),'"+item+"')]")))).click();
    }
}
