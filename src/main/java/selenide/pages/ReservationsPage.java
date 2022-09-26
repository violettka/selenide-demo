package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains User Account page locators and methods.
 */
public class ReservationsPage extends Page {

    //locators
    private static final By discoverRestBtn = By.xpath("//*[@data-qa='reservations-cta-reserve']");

    //methods
    public RestaurantsBerlinPage clickOnDiscoverRestBtn() {
        $(discoverRestBtn).click();
        return page(RestaurantsBerlinPage.class);
    }
}
