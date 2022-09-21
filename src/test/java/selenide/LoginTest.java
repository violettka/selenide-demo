package selenide;

import org.junit.jupiter.api.Test;
import selenide.pages.Homepage;
import selenide.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;

public class LoginTest {

    // classes
    Homepage homePage;
    LoginPage loginPage;

    /**
     * This test checks successful login functionality
     */
    @Test
    public void loginWithValidCredentials() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        homePage.userIconPresent();
    }
}
