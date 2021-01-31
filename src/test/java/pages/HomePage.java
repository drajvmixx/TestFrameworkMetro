package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class = 'jsx-1720290539 account-navigation-drop']")
    private WebElement accountButton;

    @FindBy(xpath = "//input[contains(@name, 'login')]")
    private WebElement phoneInLoginForm;

    @FindBy(xpath = "//input[@id = 'login-password']")
    private WebElement passwordInLoginForm;

    @FindBy(xpath = "//button[contains(@data-marker, 'Account')]")
    private WebElement accountSuccessLogin;

    @FindBy(xpath = "//div[@class = 'jsx-888617096 header-bottom-line__search']/div[contains(@data-testid, 'search-box')]/div[contains(@class, 'jsx-878740898 conditional-tablet_desktop')]/input[contains(@data-testid, 'search-box') and @class = 'jsx-1431772174 form-control SearchBox__input']")
    private WebElement searchFieldInput;

    @FindBy(xpath = "//div[contains(@class, 'infoRight')]/div[contains(@class, 'SliderWrapper')]/a[contains(@href, 'clothes')]")
    private WebElement stockPageExtends;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickAccountButton() {
        accountButton.click();
    }

    public void setPhoneNumberInLoginForm(final String keyword) {
        phoneInLoginForm.sendKeys(keyword, Keys.ENTER);
    }

    public void setPasswordInLoginForm(final String keyword) {
        passwordInLoginForm.sendKeys(keyword, Keys.ENTER);
    }

    public void selectSearchFieldInput() {
        searchFieldInput.click();
    }

    public void setSearchFieldInput(final String keyword) {
        searchFieldInput.sendKeys(keyword, Keys.ENTER);
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public void extendStockPage() {
        stockPageExtends.click();
    }

    public String getTextOfAccountSuccessLogin() {
        return accountSuccessLogin.getText();
    }
}
