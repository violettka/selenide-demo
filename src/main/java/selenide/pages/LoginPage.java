package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends Page {


    // locators

    private static By googleBtn = By.xpath("//*[@data-qa='social-provider-btn-google']");
    private static By facebookBtn = By.xpath("//*[@data-qa='social-provider-btn-facebook']");
    private static By appleBtn = By.xpath("//*[@data-qa='social-provider-btn-apple']");

    private static By checkTermsGoogle = By.cssSelector("#root>div>div>form>section>div:nth-child(2)>div.consentModal__Wrapper-sc-1favlfo-0.fJWyJT>label>i>svg");
    private static By checkTermsFacebook = By.cssSelector("#root>div>div>form>section>div:nth-child(3)>div.consentModal__Wrapper-sc-1favlfo-0.fJWyJT>label>i>svg");
    private static By checkTermsApple = By.cssSelector("#root>div>div>form>section>div:nth-child(4)>div.consentModal__Wrapper-sc-1favlfo-0.fJWyJT>label>i>svg");
    private static By connectBtn = By.xpath("//*[@data-qa='connect-btn']");

    /**
     * We are taking these locators from redirected social network websites
     * Google, Facebook and Apple
     */
    private static By initialViewForGoogle = By.cssSelector("#initialView>div.xkfVF>div>div.Lth2jb>div");
    private static By initialViewForFacebook = By.xpath("//*[@id='header_block']");
    private static By initialViewForApple = By.xpath("//*[@id='ac-localnav']");

    private static final By accCookiesBtnFB = By.id("cookie-policy-manage-dialog-accept-button");

    private static By emailField = By.xpath("//*[@data-qa='email-input']");
    private static By passwordField = By.xpath("//*[@data-qa='password-input']");
    private static By loginBtn = By.xpath("//*[@data-qa='login-btn']");


    // methods
    public void fillInValidCred() {
        $(emailField).setValue(VALID_EMAIL);
        $(passwordField).setValue(VALID_PASS);
    }

    public void clickGoogleBtn() {
        $(googleBtn).click();
    }

    public void clickFacebookBtn() {
        $(facebookBtn).click();
    }

    public void clickAppleBtn() {
        $(appleBtn).click();
    }

    public void activateTermsGoogleBtn() {
        $(checkTermsGoogle).click();
        $(connectBtn).click();
    }

    public void accCookiesFB() {
        if ($(accCookiesBtnFB).exists()) {
            $(accCookiesBtnFB).click();
        }
    }

    // Initial views

    public void checkTermsFacebookBtn() {
        $(checkTermsFacebook).click();
        $(connectBtn).click();
    }

    public void checkTermsAppleBtn() {
        $(checkTermsApple).click();
        $(connectBtn).click();
    }

    public Homepage clickOnLoginBtnHP() {
        $(loginBtn).click();
        return page(Homepage.class);
    }

    public void checkRedirectToPage(String pageName) {
        By pageLocator = null;
        if (pageName.equals("Google")) {
            pageLocator = initialViewForGoogle;
        } else if (pageName.equals("Facebook")) {
            pageLocator = initialViewForFacebook;
        } else if (pageName.equals("Apple")) {
            pageLocator = initialViewForApple;
        }
        $(pageLocator).shouldHave(text(pageName));
    }
}