package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.Homepage;
import selenide.pages.OopsPage;

import static com.codeborne.selenide.Selenide.open;

public class PageNotFoundTest {

    Homepage homePage;
    OopsPage oopsPage;
    private String randomSymbols = "abf";

    /**
     * This test checks unsuccessful entry
     */
    @Test
    public void loginWithValidCredentials() {
        homePage = open("https://www.quandoo.com/" + randomSymbols, Homepage.class);
        oopsPage.pageNotFoundMessageExists();
    }
}
