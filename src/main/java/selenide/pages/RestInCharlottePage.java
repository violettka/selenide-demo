package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains Restaurants In Charlottenburg page locators and methods.
 */
public class RestInCharlottePage {

    //locators
    private static final By showAllBtn = By.xpath("//*[@data-qa='show-all-button']");
    private static final By burgersBtn = By.xpath("//li[8]/label/i");
    private static final By bookableOnlineBtn = By.xpath("//*[@data-qa='bookable-online-button']");
    private static final By twoFriends = By.xpath("//div[@id='tab-merchants']/div[2]/div/a");

    //methods
    public TwoFriends chooseBurgersFilter() {
        $(showAllBtn).click();
        $(burgersBtn).click();
        $(bookableOnlineBtn).click();
        $(twoFriends).click();
        return page(TwoFriends.class);
    }
}
