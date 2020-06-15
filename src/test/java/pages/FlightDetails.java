package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class FlightDetails extends BasePage {

    private final Locators.FlightDetailsPageLocators flightDetailsPageLocators;

    public FlightDetails(WebDriver driver) {
        super(driver);
        flightDetailsPageLocators = new Locators.FlightDetailsPageLocators();
    }

    public String validateLocationFromA() {
        wait.until(visibilityOfElementLocated(flightDetailsPageLocators.fromCityA));
        return driver.findElement(flightDetailsPageLocators.fromCityA).getText();
    }

    public String validateLocationToB() {
        wait.until(visibilityOfElementLocated(flightDetailsPageLocators.toCityB));
        return driver.findElement(flightDetailsPageLocators.toCityB).getText();
    }

    public String validateLocationFromB() {
        wait.until(visibilityOfElementLocated(flightDetailsPageLocators.fromCityB));
        return driver.findElement(flightDetailsPageLocators.fromCityB).getText();
    }

    public String validateLocationToC() {
        wait.until(visibilityOfElementLocated(flightDetailsPageLocators.toCityC));
        return driver.findElement(flightDetailsPageLocators.toCityC).getText();
    }

    public String validateLocationFromC() {
        wait.until(visibilityOfElementLocated(flightDetailsPageLocators.fromCityC));
        return driver.findElement(flightDetailsPageLocators.fromCityC).getText();
    }

    public String validateLocationToA() {
        wait.until(visibilityOfElementLocated(flightDetailsPageLocators.toCityA));
        return driver.findElement(flightDetailsPageLocators.toCityA).getText();
    }

    public String validateFirstFlightDate() {
        return driver.findElement(flightDetailsPageLocators.firstDate).getText();
    }

    public String validateSecondFlightDate() {
        return driver.findElement(flightDetailsPageLocators.secondDate).getText();
    }

    public String validateThirdFlightDate() {
        return driver.findElement(flightDetailsPageLocators.thirdDate).getText();
    }
}
