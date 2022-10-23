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

    public static String specialName = "";

    // classes
    static Faker faker = new Faker();

    // constant credentials
    public static String VALID_EMAIL = "violetaabramova@yandex.ru";
    public static String VALID_PASS = "8vzN$ht4eFuG45$";
    public static String CUISINES_PIZZA = "Pizza";
    public static String RESTAURANT_CITY = "Berlin";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;

    //test data
    public static String SAMPLE_RESTAURANT = "cavallino rosso";
    public static String SAMPLE_CITY = "Berlin";
    public static String USER_FIRST_NAME = faker.name().firstName();
    public static String USER_LAST_NAME = faker.name().lastName();

    // constant locators
    public static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    public static final By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    public static final By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    public static final By reservationsBtn = By.xpath("//*[@data-qa='navigation-reservations']");
    public static final By profileBtn = By.xpath("//*[@data-qa='header-navigation-profile']");
    public static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    protected static final By searchCityField = By.xpath("//*[@data-qa='search-bar-destination-input']");
    protected static final By searchRestaurantField = By.xpath("//input[@name='dining']");
    private static By restaurantName = By.xpath("//*[@data-qa='reservation-details-merchant-name']");
    private static final By upcomingReservations = By.xpath("//*[@data-qa='cards-upcoming-reservations']");

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }

    public ProfilePage clickOnProfileBtn() {
        $(userIcon).shouldBe(Condition.visible);
        $(userIcon).click();
        $(profileBtn).click();
        return page(ProfilePage.class);
    }

    public UserReservationsPage clickOnReservationsBtn() {
        $(reservationsBtn).click();
        return page(UserReservationsPage.class);
    }

    public UserReservationsPage clickOnLoginIcon() {
        specialName = $(restaurantName).getText();
        $(userIcon).shouldHave(Condition.visible);
        $(userIcon).click();
        $(reservationsBtn).shouldHave(Condition.visible);
        $(reservationsBtn).click();
        $(upcomingReservations).shouldHave(Condition.text(specialName));
        return page(UserReservationsPage.class);
    }
}
