package selenide.pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {

    // classes
    static Faker faker = new Faker();

    // constant credentials
    public static String VALID_EMAIL = "violetaabramova@yandex.ru";
    public static String VALID_PASS = "8vzN$ht4eFuG45$";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;

    // constant locators

    public static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private static By logoutBtn = By.xpath("//*[@data-qa='header-navigation-logout']");


    // Methods
    public void accCookies() {
        if ($(accCookiesBtn).exists()) {
            $(accCookiesBtn).click();
        }
    }

    public void clickOnLogoutBtn() {
        $(logoutBtn).click();
    }
}