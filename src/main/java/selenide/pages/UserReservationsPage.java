package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class UserReservationsPage contains all user reservations page locators and methods.
 */
public class UserReservationsPage extends Page {

    //locators
    private static final By editReservationBtn = By.xpath("//button[contains(.,'Edit reservation')]");

    //methods
    public EditReservationPage clickOnEditReservation() {
        $(editReservationBtn).shouldBe(Condition.visible);
        $(editReservationBtn).click();
        return page(EditReservationPage.class);

    // locators
    private static final By wartesaal = By.xpath("//a[@href='/place/wartesaal-11828']/h3");

    // methods
    public void restaurantIsDisplayed() {
        $(wartesaal).should(exist);
    }

    public RestaurantPage restaurantClick() {
        $(wartesaal).click();
        return page(RestaurantPage.class);
    }
}
