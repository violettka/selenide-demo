package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class FilterPage extends Page {

    // locators
    private static By wartesaal = By.xpath("//a[@href='/en/place/wartesaal-11828']");

    // Methods
    public RestaurantPage clickOnRestaurant() {
        $(wartesaal).click();
        return page(RestaurantPage.class);
    }
}
