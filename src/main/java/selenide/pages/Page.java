package selenide.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {

    Homepage homepage;
    LoginPage loginPage;
    FilterPage filterPage;
    RestaurantPage restaurantPage;
    ReservationPage reservationPage;
    CheckoutSummaryPage checkoutSummaryPage;
    UserReservationsPage userReservationsPage;

    // constant locators
    //    private static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    //    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    //    private static By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    //    private static final By profileFiels = By.xpath("//*[@data-qa='header-navigation-profile']");

    // constant credentials
    public static String VALID_EMAIL = "violetaabramova@yandex.ru";
    public static String VALID_PASS = "8vzN$ht4eFuG45$";
    public static String RESTAURANT_NAME = "Wartesaal";
    public static String RESTAURANT_CITY = "Berlin";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;

    // classes
    protected Faker faker;
    // Locators
    private static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }

}
