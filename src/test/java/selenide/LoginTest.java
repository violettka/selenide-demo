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
     * This test checks successful login and logout functionality
     */
    @Test
    public void loginWithValidCredentials() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        homePage.userIconPresent();
        homePage.userIconHover();
        homePage.clickOnLogoutBtn();
        homePage.checkLoginBtn();
    }

    /**
     * This test checks functionality of social network buttons (google)
     * without complete login
     */
    @Test
    public void googleBtnValidation() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.clickGoogleBtn();
        loginPage.activateTermsGoogleBtn();
        loginPage.checkRedirectToPage("Google");
    }

    /**
     * This test checks functionality of social network buttons (facebook)
     * without complete login
     */
    @Test
    public void facebookBtnValidation() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.clickFacebookBtn();
        loginPage.checkTermsFacebookBtn();
        loginPage.accCookiesFB();
        loginPage.checkRedirectToPage("Facebook");
    }

    /**
     * This test checks functionality of social network buttons (apple)
     * without complete login
     */
    @Test
    public void appleBtnValidation() {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.clickAppleBtn();
        loginPage.checkTermsAppleBtn();
        loginPage.checkRedirectToPage("Apple");
    }
}