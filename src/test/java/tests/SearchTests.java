package tests;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {
    public static final String UTF_8 = "UTF-8";
    public static final String SMETANA_SEARCH_KEYWORD = "сметана";
    public static final String SEARCH_QUERY = "search?q=";

    @Test
    public void checkThatUrlContainsSearchWord() throws UnsupportedEncodingException {
        getHomePage().selectSearchFieldInput();
        getBasePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        getHomePage().setSearchFieldInput(SMETANA_SEARCH_KEYWORD);
        getBasePage().waitForPageLoadComplete(DEFAULT_TIMEOUT);
        final String smetanaSearchUrl = SEARCH_QUERY + URLEncoder.encode(SMETANA_SEARCH_KEYWORD, UTF_8);
        assertTrue(getHomePage().getPageUrl().contains(smetanaSearchUrl));
    }
}
