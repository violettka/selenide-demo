package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class Homepage contains all homepage locators and methods.
 */
public class Homepage extends Page {

    // locators
    private static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    private static By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    private static final By loginIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    private static final By profileFiels = By.xpath("//*[@data-qa='header-navigation-profile']");

    // methods
    public SignUpPage clickOnSignUpBtn() {
        $(signUpBtn).click();
        return page(SignUpPage.class);
    }

    public LoginPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LoginPage.class);
    }

    public void userIconPresent() {
        $(userIcon).should(Condition.exist);
    }

    public ProfilePage userAcc() {
        Selenide.sleep(3000);
        $(loginIcon).doubleClick();
        $(profileFiels).click();
        return page(ProfilePage.class);
    }
}