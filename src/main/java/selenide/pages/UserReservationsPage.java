package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class UserReservationsPage contains all user reservations page locators and methods.
 */
public class UserReservationsPage extends Page {

    //locators
    private static final By editReservationBtn = By.xpath("//button[contains(.,'Edit reservation')]");
    private static final By upcomingReservations = By.xpath("//*[@data-qa='cards-upcoming-reservations']");
    private static final By discoverRestaurantsBtn = By.xpath("//*[@data-qa='reservations-cta-reserve']");

    //methods
    public EditReservationPage clickOnEditReservation() {
        $(editReservationBtn).shouldBe(Condition.visible);
        $(editReservationBtn).click();
        return page(EditReservationPage.class);
    }

    public void anyRestaurantIsDisplayed() {
        $(upcomingReservations).shouldHave(Condition.exist);
        $(discoverRestaurantsBtn).shouldNot(Condition.exist);
    }
}
