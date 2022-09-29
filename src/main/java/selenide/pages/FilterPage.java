package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains Filter page locators and methods.
 */
public class FilterPage extends Page {

    //locators
    private static final By argentianFilter = By.xpath("//li[4]/label/i");
    private static final By laBandidaBtn = By.xpath("//div[@id='tab-merchants']/div[3]/div/a");

    //methods
    public RestaurantPage chooseFilter() {
        $(argentianFilter).click();
        $(laBandidaBtn).click();
        return page(RestaurantPage.class);
    }

    public ProfilePage clickOnProfileBtnAgain(){
        $(profileBtn).click();
        return page(ProfilePage.class);
    }
}
