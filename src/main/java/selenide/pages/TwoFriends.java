package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains Two Friends page locators and methods.
 */
public class TwoFriends {

    //locators
    private static final By menuBtn = By.xpath("//*[@data-qa='sub-nav-tab-tab-menu']");
    private static final By translateBtn = By.xpath("//*[@data-qa='translate-menu-items']");
    private static final By photosBtn = By.xpath("//*[@data-qa='sub-nav-tab-tab-photos']");
    private static final By logoBtn = By.xpath("//*[@data-qa='header-logo']");

    //methods
    public Homepage twoFriends() {
        $(menuBtn).click();
        $(translateBtn).click();
        $(photosBtn).click();
        $(logoBtn).click();
        return page(Homepage.class);
    }
}
