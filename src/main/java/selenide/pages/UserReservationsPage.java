package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class UserReservationsPage contains all user reservations page locators and methods.
 */
public class UserReservationsPage extends Page {

    //locators
    private static final By editReservationBtn = By.xpath("//button[contains(.,'Edit reservation')]");
    private static final By reservationCard = By.xpath("//*[@data-qa='reservation-card-0']");
    private static final By cancelBtn = By.xpath("//div[2]/button");
    private static final By cancelReservation = By.xpath("//*[@data-qa='cancel_no']");

    //methods
    public EditReservationPage clickOnEditReservation() {
        $(editReservationBtn).shouldBe(Condition.visible);
        $(editReservationBtn).click();
        return page(EditReservationPage.class);
    }
    public UserReservationsPage clickOnCancelPresentReservation() {
        $(reservationCard).shouldBe(Condition.visible);
        Selenide.sleep(2000);
        $(cancelBtn).click();
        $(cancelReservation).shouldHave(Condition.visible);
        Selenide.sleep(2000);
        $(cancelReservation).click();
        return page(UserReservationsPage.class);
    }
}
