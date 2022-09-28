package pages;
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
    public static String NAME = "Mogg";
    public static String CITY = "Berlin";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;
    public static String ENQUIRY_URL = BASE_URL + "/checkout/enquiry?restaurantUrl=cavallino-rosso-306";

    // classes
    protected Faker faker;

    // Locators
    private static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private Page filterPage;

    protected Page() {
    }

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }


    public void fillRestaurantField(String name) {
    }

    public void fillDestinationField(String city) {
    }
    public void fillFindCityField(String city) {

        filterPage.fillFindCityField(CITY);
    }
    public void fillFindRestaurantField(String name) {
        filterPage.fillFindRestaurantField(NAME);
    }
}

