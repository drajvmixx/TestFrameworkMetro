package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {
    public static final String EXPECTED_CART_ITEMS_AMOUNT = "1";
    public static final String MARTINI_KEYWORD = "martini";

    @Test
    public void checkAddToCart() {
        getHomePage().clickAccountButton();
        getHomePage().setPhoneNumberInLoginForm("+380960000000");
        getHomePage().setPasswordInLoginForm("000000");
        getBasePage().implicitWait(120);
        getHomePage().setSearchFieldInput(MARTINI_KEYWORD);
        getBasePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        WebElement firstItem = getSearchResultsPage().getFirstSearchResultItem();
        getBasePage().waitVisibilityOfElement(DEFAULT_TIMEOUT, firstItem);
        getSearchResultsPage().clickAddToCartButton();
        getBasePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(getSearchResultsPage().getCartItemsAmount(), EXPECTED_CART_ITEMS_AMOUNT);
    }
}
