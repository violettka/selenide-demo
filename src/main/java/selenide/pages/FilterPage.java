package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class FilterPage contains all filter page locators and methods.
 */
public class FilterPage extends Page {

    // locators
    private static final By firstRestaurantBtn = By.xpath("//*[@id='tab-merchants']/div[2]/div[1]/a");

    // Methods
    public RestaurantPage clickOnFirstRestaurantBtn() {
        $(firstRestaurantBtn).click();
        return page(RestaurantPage.class);
    }
}
