package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class RestaurantPage contains all restaurant page locators and methods.
 */
public class RestaurantPage extends Page {

    //locators
    private static final By chooseDateField = By.xpath("//*[@data-qa='widget-date-picker-selection']");
    private static final By nextMonth = By.xpath("//*[@data-qa='day-picker-navbar-next']");
    private static final By firstDayOfTheMonth = By.xpath("//*[@class='DayPicker-Day'][@tabindex='-1']");
    private static final By reserveTableBtn = By.xpath("//*[@data-vwo='reservation-init']");
    private static final By timePickerStartField = By.xpath("//*[@data-qa='widget-time-picker-start']/select");
    private static final By timePickerEndField = By.xpath("//*[@data-qa='widget-time-picker-end']/select");
    private static final By timeMoveLeft = By.xpath("//*[@data-qa='time-move-left']");
    private static final By firstPossibleBookingTime = By.xpath("(//*[@data-qa='booking-times']/ul/li/ul/li)[1]");

    //methods
    public void chooseReservationDate() {
        $(chooseDateField).shouldBe(Condition.visible);
    }

    public void dayChoose() {
        $(chooseDateField).shouldBe(Condition.visible);
        $(chooseDateField).click();
        $(nextMonth).click();
        $(firstDayOfTheMonth).click();
    }

    public void chooseTimeslot(String timeFrom, String timeTo) {
        $(timePickerStartField).selectOption(timeFrom);
        $(timePickerEndField).selectOption(timeTo);
    }

    public CompleteReservationPage clickOnReserveBtn() {
        $(reserveTableBtn).click();
        return page(CompleteReservationPage.class);
    }

    public CompleteReservationPage reserveNow() {
        dayChoose();
        $(timeMoveLeft).click();
        $(firstPossibleBookingTime).click();
        clickOnReserveBtn();
        return page(CompleteReservationPage.class);
    }
}
