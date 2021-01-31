package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StockPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'list-item')]/a[contains(@href, 'chef')]")
    private WebElement categoryChef;

    @FindBy(xpath = "//div[contains(@class, 'products-box__list-item')]//span[contains(@class, 'product-tile__title')]")
    private List<WebElement> productsList;

    public StockPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCategoryChef() {
        categoryChef.click();
    }

    public List<WebElement> getProductsTitles() {
        return productsList;

    }
}
