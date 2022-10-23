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
    public static String ENQUIRY_URL = BASE_URL + "/checkout/enquiry?restaurantUrl=cavallino-rosso-306";
    public static final String BERLIN_URL = "https://www.quandoo.de/en/result?destination=berlin";

    //test data
    public static String SAMPLE_RESTAURANT = "cavallino rosso";
    public static String SAMPLE_CITY = "Berlin";
    public static String USER_FIRST_NAME = faker.name().firstName();
    public static String USER_LAST_NAME = faker.name().lastName();

    // constant locators
    private static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    public static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    public static final By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    public static final By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    public static final By reservationsBtn = By.xpath("//*[@data-qa='navigation-reservations']");
    public static final By profileBtn = By.xpath("//*[@data-qa='header-navigation-profile']");
    protected static final By searchCityField = By.xpath("//*[@data-qa='search-bar-destination-input']");
    protected static final By searchRestaurantField = By.xpath("//input[@name='dining']");
    public static final By textOptional = By.xpath("//*[@class='Optional']");

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }

    public UserReservationsPage clickOnProfileBtn() {
        $(userIcon).shouldBe(Condition.visible);
        $(userIcon).click();
        $(profileBtn).click();
        return page(UserReservationsPage.class);
    }

    public UserReservationsPage clickOnUserIcon() {
        $(userIcon).click();
        return page(UserReservationsPage.class);
    }
}