package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains Coln page locators and methods.
 */
public class ColnPage extends Page {

    //constants
    private static final By outdoorBtn = By.xpath("//*[@data-qa='filter-button-new']");
    private static final By relevanceBtn = By.xpath("//*[@data-qa='listing-sort-dropdown']");
    private static final By mostReviewedBtn = By.xpath("//*[@data-qa='review-sort-reviewCount']");
    private static final By logoBtn = By.xpath("//*[@data-qa='header-logo']");

    //methods
    public Homepage outdoorSeating() {
        $(outdoorBtn).click();
        $(relevanceBtn).click();
        $(mostReviewedBtn).click();
        $(logoBtn).click();
        return page(Homepage.class);
    }
}
