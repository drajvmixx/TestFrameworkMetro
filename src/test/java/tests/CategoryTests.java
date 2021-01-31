package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by Iryna on 8/12/2020.
 */
public class CategoryTests extends BaseTest {
    public static final String CHEF_KEYWORD = "Chef";

    @Test
    public void checkChefCategoryContainsChefProductsOnly() {
        getBasePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        getHomePage().extendStockPage();
        getBasePage().implicitWait(DEFAULT_TIMEOUT);
        getStockPage().clickOnCategoryChef();
        getBasePage().implicitWait(DEFAULT_TIMEOUT);
        List<WebElement> productsTitles = getStockPage().getProductsTitles();
        for (WebElement product : productsTitles) {
            assertTrue(product.getText().contains(CHEF_KEYWORD));
        }
    }
}
