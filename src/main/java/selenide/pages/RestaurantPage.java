package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RestaurantPage extends Page {

    // locators
    private static final By chooseDateField = By.xpath("//*[@data-qa='widget-date-picker-selection']");
    private static final By nextMonth = By.xpath("//*[@data-qa='day-picker-navbar-next']");
    private static final By firstDayOfTheMonth = By.xpath("//*[@class='DayPicker-Day'][@tabindex='0']");
    private static final By timePickerStartField = By.xpath("//*[@data-qa='widget-time-picker-start']/select");
    private static final By timePickerEndField = By.xpath("//*[@data-qa='widget-time-picker-end']/select");
    private static By reserveBtn = By.xpath("//button[@data-vwo='reservation-init']");

    // methods
    public void dayChoose() {
        $(chooseDateField).click();
        $(nextMonth).click();
        $(firstDayOfTheMonth).click();
    }

    public void chooseTimeslot(String timeFrom, String timeTo) {
        $(timePickerStartField).selectOption(timeFrom);
        $(timePickerEndField).selectOption(timeTo);
    }

    public ReservationPage clickOnReserveBtn() {
        $(reserveBtn).click();
        return page(ReservationPage.class);
    }

    public void reserveNow(String timeFrom, String timeTo) {
        restaurantPage.dayChoose();
        restaurantPage.chooseTimeslot(timeFrom, timeTo);
        reservationPage = restaurantPage.clickOnReserveBtn();
    }
}
