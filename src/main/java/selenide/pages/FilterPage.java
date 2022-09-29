package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains Restaurants in Berlin page locators and methods.
 */
public class FilterPage extends Page {

    //locators
    private static final By argentianFilter = By.xpath("//li[4]/label/i");
    private static final By laBandida = By.xpath("//div[@id='tab-merchants']/div[3]/div/a");

    //methods
    public RestaurantPage chooseFilter() {
        $(argentianFilter).click();
        $(laBandida).click();
        return page(RestaurantPage.class);
    }
}
