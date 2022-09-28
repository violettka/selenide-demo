package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class UserReservationsPage extends Page{

    // locators
    static final By mogg = By.xpath("//*[@data-qa='merchant-name']");

    // methods
    public void restaurantIsDisplayed() {
        $(mogg).isDisplayed();
    }

    public RestaurantPage restaurantClick() {
        $(mogg).click();
        return page(RestaurantPage.class);
    }
}
