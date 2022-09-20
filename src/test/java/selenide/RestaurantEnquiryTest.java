package selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import selenide.pages.RestaurantEnquiryPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Class RestaurantEnquiryTest contains tests to Send Enquiry functionality
 */
public class RestaurantEnquiryTest {

    RestaurantEnquiryPage enqPage;

    @Test
    /**
     * Negative test which ensures that there is no ability to send enquiry without ticking Terms checkbox.
     */
    public void enquiryWithoutTermsAndPrivacy() {
        //open
        enqPage = open("https://www.quandoo.de/en/checkout/enquiry?restaurantUrl=cavallino-rosso-306", RestaurantEnquiryPage.class);
        enqPage.accCookies();
        enqPage.sendEnquiryBtnElt().shouldHave(Condition.attribute("disabled"));
        //choose date and time
        enqPage.chooseEnquiryTimeslot("7:00 pm", "7:30 pm");
        //fill in data
        enqPage.fillInDataFields();
        enqPage.sendEnquiryBtnElt().shouldNotHave(Condition.attribute("disabled"));
    }
}