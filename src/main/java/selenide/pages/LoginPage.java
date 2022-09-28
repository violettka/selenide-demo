package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends Page {

    LoginPage  loginPage;

    // locators
    private static final By emailField = By.xpath("//*[@data-qa='email-input']");
    private static final By passwordField = By.xpath("//*[@data-qa='password-input']");
    private static final By loginBtn = By.xpath("//*[@data-qa='login-btn']");

    // methods
    public void fillInValidCred() {
        $(emailField).setValue(VALID_EMAIL);
        $(passwordField).setValue(VALID_PASS);
    }

    public Homepage clickOnLoginBtnHP() {
        $(loginBtn).click();
        return Selenide.page(Homepage.class);
    }
}

