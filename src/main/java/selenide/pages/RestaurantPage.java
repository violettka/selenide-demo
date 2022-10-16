package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class RestaurantPage extends Page {

    /**
     * Class RestaurantPage contains all restaurant page locators and methods.
     */

    // locators
    public static final By chooseDateField = By.xpath("//*[@data-qa='widget-date-picker-selection']");
    public static final By nextMonth = By.xpath("//*[@data-qa='day-picker-navbar-next']");
    private static final By timeSelected = By.xpath("//li[@data-qa='time-selected']");
    private static final By reserveBtn = By.xpath("//button[@data-vwo='reservation-init']");
    private static final By firstDayOfTheMonth = By.xpath("//*[@class='DayPicker-Day'][@tabindex='0']");
    private static final By reserveTableBtn = By.xpath("//*[@data-vwo='reservation-init']");

    // methods

    public ReservationPage clickOnReserveBtn() {
        $(reserveBtn).click();
        return Selenide.page(ReservationPage.class);
    }

    public CompleteReservationPage clickOnReserveTable() {
        $(reserveTableBtn).click();
        return page(CompleteReservationPage.class);
    }

    public void chooseReservationDate() {
        $(chooseDateField).shouldBe(Condition.visible);
        $(chooseDateField).click();
        $(nextMonth).click();
        $(firstDayOfTheMonth).click();
    }
}



