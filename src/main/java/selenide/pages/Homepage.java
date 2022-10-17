package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class Homepage contains all homepage locators and methods.
 */
public class Homepage extends Page {

    // locators

    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    private static By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    private static By logoutBtn = By.xpath("//*[@data-qa='header-navigation-logout']");

    // methods

    public LoginPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LoginPage.class);
    }

    public void userIconPresent() {
        $(userIcon).should(Condition.exist);
    }

    public void userIconHover() {
        $(userIcon).hover();
    }

    public void clickOnLogoutBtn() {
        $(logoutBtn).click();
    }

    public void checkLoginBtn(){
        $(loginBtn).should(Condition.exist);
    }
}