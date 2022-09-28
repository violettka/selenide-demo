package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class FilterPage extends Page {


    // locators
   // private static By american = By.xpath("//*[@data-qa='filter-cuisine-label-bb74090f-73d9-4d67-9283-094a678438e5']");

    private static final By findRestaurantField = By.xpath("//*[@data-qa='search-bar-dining-input']");
    private static final By findCityField = By.xpath("//*[@data-qa='search-bar-destination-input'");
    private static final By searchBtn = By.xpath("//*[@data-qa='button-search-find-header']");

    // Methods
    public RestaurantPage clickOnRestaurant() {
        $(UserReservationsPage.mogg).click();
        return Selenide.page(RestaurantPage.class);
    }

    public void clickOnFindCityField() {
    }


    public void clickOnFindRestaurantField() {

    }


    public FilterPage clickOnSearchBtn() {

        $(searchBtn).click();
        return page(FilterPage.class);

    }
}

