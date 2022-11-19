package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RestaurantEnquiryPage extends Page {
    // locators
    private static final By emailField = By.xpath("//*[@data-qa='input-email']");
    private static final By firstNameField = By.xpath("//*[@data-qa='input-first-name']");
    private static final By lastNameField = By.xpath("//*[@data-qa='input-last-name']");
    private static final By phoneNumberField = By.xpath("//*[@data-qa='input-phone']");
    private static final By timePickerStartField = By.xpath("//*[@data-qa='widget-time-picker-start']/select");
    private static final By timePickerEndField = By.xpath("//*[@data-qa='widget-time-picker-end']/select");

    private static final By sendEnquiryBtn = By.xpath("//*[@data-qa='enquiry-submit']");

    // methods
    public void fillInDataFields() {
        faker = new Faker();
        $(emailField).setValue(faker.internet().emailAddress());
        $(firstNameField).setValue(faker.name().firstName());
        $(lastNameField).setValue(faker.name().lastName());
        $(phoneNumberField).setValue(faker.phoneNumber().phoneNumber());
    }

    public void chooseEnquiryTimeslot(String timeFrom, String timeTo) {
        $(timePickerStartField).selectOption(timeFrom);
        $(timePickerEndField).selectOption(timeTo);
    }

    public SelenideElement sendEnquiryBtnElt() {
        return $(sendEnquiryBtn);
    }
}
