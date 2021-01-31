package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;
import static tests.BaseTest.DEFAULT_TIMEOUT;


public class SearchResultsPage extends BasePage {
    private static final int PAUSE = 3000;

    @FindBy(xpath = "//div[contains(@class, 'header-bottom-line__bar')]//span[contains(@class, 'CartButton__badge')]")
    private WebElement cartItemsAmount;

    private final By firstProductXpath = xpath("//div[contains(@class, 'products-box__list-item')][1]");

    private final By addToCartButtonXpath = xpath("//div[contains(@class, 'products-box__list-item')][1]//button[contains(@class,'add-to-cart')]");


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getCartItemsAmount() {
        return cartItemsAmount.getText();
    }

    public WebElement getFirstSearchResultItem() {
        return driver.findElement(firstProductXpath);
    }

    public void clickAddToCartButton() {
        new Actions(driver).pause(PAUSE).moveToElement(driver.findElement(firstProductXpath)).perform();
        WebElement addToCartButton = driver.findElement(addToCartButtonXpath);
        waitVisibilityOfElement(DEFAULT_TIMEOUT, addToCartButton);
        addToCartButton.click();
    }
}
