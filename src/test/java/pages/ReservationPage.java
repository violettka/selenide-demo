package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationPage extends Page {

    // locators
    private static final By reserveNowBtn = By.xpath("//button[@data-qa='reservation-submit']");
    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    private static By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");

    // methods

    public LoginPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LoginPage.class);
    }

    public void userIconPresent() {
        $(userIcon).isDisplayed();
    }
}

