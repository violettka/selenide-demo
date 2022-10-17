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

    // test data
    public static String SAMPLE_RESTAURANT = "cavallino rosso";
    public static String SAMPLE_CITY = "Berlin";
    public static String USER_FIRST_NAME = faker.name().firstName();
    public static String USER_LAST_NAME = faker.name().lastName();

    // constant locators

    public static final By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    public static final By reservationsBtn = By.xpath("//*[@data-qa='navigation-reservations']");
    public static final By profileBtn = By.xpath("//*[@data-qa='header-navigation-profile']");
    public static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private static final By accCookiesBtnFB = By.id("cookie-policy-manage-dialog-accept-button");
    protected static final By searchCityField = By.xpath("//*[@data-qa='search-bar-destination-input']");
    protected static final By searchRestaurantField = By.xpath("//input[@name='dining']");


    // Methods
    public void accCookies() {
        if ($(accCookiesBtn).exists()) {
            $(accCookiesBtn).click();
        }
    }

    public void accCookiesFB() {
        if ($(accCookiesBtnFB).exists()) {
            $(accCookiesBtnFB).click();
        }
    }
}
