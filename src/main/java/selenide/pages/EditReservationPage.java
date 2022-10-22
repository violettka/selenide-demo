package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static selenide.pages.RestaurantPage.chooseDateField;
import static selenide.pages.RestaurantPage.nextMonth;

/**
 *  Class EditReservationPage contains all edit reservation page locators and methods.
 */
public class EditReservationPage extends Page {

    //locators
    private static final By updateReservationBtn = By.xpath("//*[@data-qa='reservation-edit-submit']");
    private static final By secondDayOfTheMonth = By.xpath("//*[@class='DayPicker-Day'][@tabindex='-1']");
    private static final By textOptional = By.xpath("//span[contains( text(),'Optional')]");

    //methods
    public void chooseReservationDateERP() {
        $(chooseDateField).shouldBe(Condition.visible);
        $(chooseDateField).click();
        $(nextMonth).click();
        $(secondDayOfTheMonth).click();
    }

    public EditReservationPage clickOnUpdateReservationBtn() {
        $(updateReservationBtn).click();
        return Selenide.page(EditReservationPage.class);
    }

    public EditReservationPage checkTextOptional() {
        $(textOptional).shouldBe(Condition.visible);
        $(textOptional).click();
        return page(EditReservationPage.class);
    }
}