package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class FilterPage contains all filter page locators and methods.
 */

public class FilterPage extends Page {


    // locators

    private static final By firstRestaurantBtn = By.xpath("//*[@id='tab-merchants']/div[2]/div[1]/a");
    private static final By findRestaurantField = By.xpath("//*[@data-qa='search-bar-dining-input']");
    private static final By findCityField = By.xpath("//*[@data-qa='search-bar-destination-input'");
    private static final By searchBtn = By.xpath("//*[@data-qa='button-search-find-header']");

    // Methods

    public FilterPage clickOnSearchBtn() {

        $(searchBtn).click();
        return page(FilterPage.class);

    }

    public RestaurantPage clickOnFirstRestaurantBtn() {
        $(firstRestaurantBtn).click();
        return page(RestaurantPage.class);
    }
}

