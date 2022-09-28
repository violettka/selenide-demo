package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RestaurantPage extends Page {
    RestaurantPage restaurantPage;
    ReservationPage reservationPage;


    // locators
    private static final By chooseDateField = By.xpath("//*[@data-qa='widget-date-picker-selection']");
    private static final By nextMonth = By.xpath("//*[@data-qa='day-picker-navbar-next']");
    private static final By lastDayOfTheMonth = By.xpath("//*[@class='DayPicker-Day'][@tabindex='-1']");
    private static final By twelveThirty = By.xpath("//span[contains( text(),'12:30 pm')]");
    private static final By timeSelected = By.xpath("//li[@data-qa='time-selected']");
    private static final By reserveBtn = By.xpath("//button[@data-vwo='reservation-init']");

    // methods
    public void dayChoose() {
        $(chooseDateField).click();
        $(nextMonth).click();
        $(lastDayOfTheMonth).click();
    }

    public void timeChoose() {
        $(twelveThirty).click();
        $(timeSelected).isEnabled();
    }

    public ReservationPage clickOnReserveBtn() {
        $(reserveBtn).click();
        return page(ReservationPage.class);
    }

    public void reserveNow() {
        restaurantPage.dayChoose();
        restaurantPage.timeChoose();
        reservationPage = restaurantPage.clickOnReserveBtn();
    }
}



