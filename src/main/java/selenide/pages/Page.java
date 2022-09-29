package selenide.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {
    // constant credentials
    public static String VALID_EMAIL = "violetaabramova@yandex.ru";
    public static String VALID_PASS = "8vzN$ht4eFuG45$";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;

    // constant locators
    public static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    public static final By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    public static final By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    public static final By profileBtn = By.xpath("//*[@data-qa='header-navigation-profile']");
    public static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    // classes
    protected Faker faker;

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }

}
