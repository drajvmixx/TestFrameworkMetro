package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Iryna on 8/7/2020.
 */
public class LoginTests extends BaseTest {
    private String EXPECTED_LOGIN_SUCCESS = "Акаунт";

    @Test(priority = 1)
    public void signInWithExistentUser() {
        getHomePage().clickAccountButton();
        getHomePage().setPhoneNumberInLoginForm("+380964981256");
        getHomePage().setPasswordInLoginForm("229009");
        getBasePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(getHomePage().getTextOfAccountSuccessLogin(), EXPECTED_LOGIN_SUCCESS);
    }
}

