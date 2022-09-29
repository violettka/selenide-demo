package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class Homepage contains all homepage locators and methods.
 */
public class Homepage extends Page {

    // locators


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
        $(userIcon).doubleClick();
        $(profileBtn).click();
        return page(ProfilePage.class);
    }
}