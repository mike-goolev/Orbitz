package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.TestConfig;

public class HomePage extends BasePage {
    private final Locators.HomePageLocators homePageLocators;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageLocators = new Locators.HomePageLocators();
    }

    /**
     * Navigates to the home page via URL
     */
    public void loadHomePageByURL() {
        String currentUrl = driver.getCurrentUrl();
        String toUrl = TestConfig.getBaseUrl();

        if (!currentUrl.equals(toUrl)) {
            driver.get(toUrl);
        }
    }

    public void selectFlightTab() {
        click(homePageLocators.flightsBtn);
    }

    public void selectMulticityOption() {
        click(homePageLocators.multiCityBtn);
    }

    public void selectAdults() {
        click(homePageLocators.adultsDropDown);
        click(homePageLocators.adultsValueDropDown);
    }

    public void selectChildren() {
        click(homePageLocators.childrenDropDown);
        click(homePageLocators.childrenValueDropDown);
    }

    public void specifyChildrenAge() {
        click(homePageLocators.firstChildrenAgeDropDown);
        click(homePageLocators.firstChildrenAgeValue);

        click(homePageLocators.secondChildrenAgeDropDown);
        click(homePageLocators.secondChildrenAgeValue);
    }

    public void enterFirstDeparture(String departure) {
        setElementText(homePageLocators.departureFirst, departure);
    }

    public void enterFirstDestination(String destination) {
        setElementText(homePageLocators.destinationFirst, destination);
    }

    public void enterSecondtDeparture(String departure) {
        setElementText(homePageLocators.departureSecond, departure);
    }

    public void enterSecondDestination(String destination) {
        setElementText(homePageLocators.destinationSecond, destination);
    }

    public void enterThirdDeparture(String departure) {
        setElementText(homePageLocators.departureThird, departure);
    }

    public void enterThirdDestination(String destination) {
        setElementText(homePageLocators.destinationThird, destination);
    }

    public void addFlights() {
        click(homePageLocators.addFlightBtn);
    }

    public void enterFirstDate(String date) {
        setElementText(homePageLocators.departureDateFirst, date);
    }

    public void enterSecondDate(String date) {
        setElementText(homePageLocators.departureDateSecond, date);
    }

    public void enterThirdDate(String date) {
        setElementText(homePageLocators.departureDateThird, date);
        click(homePageLocators.closeBtn);
    }

    public void submitSearch() {
        click(homePageLocators.searchBtn);
    }
}
