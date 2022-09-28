package selenide.pages;

import com.codeborne.selenide.Condition;
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
    private static final By charlottenburgBtn = By.xpath("//div[@id='explore']/div/div[2]/div/div/a[2]/h4");
    private static final By colnBtn = By.xpath("//div[3]/div/div/div/a[2]");

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

    public RestInCharlottePage clickOnCharlotte(){
        $(charlottenburgBtn).click();
        return page(RestInCharlottePage.class);
    }

    public ColnPage clickOnColnBtn(){
        $(colnBtn).click();
        return page(ColnPage.class);
    }
}