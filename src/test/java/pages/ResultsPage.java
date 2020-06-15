package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ResultsPage extends BasePage {
    private final Locators.ResultsPageLocators resultsPageLocators;

    public ResultsPage(WebDriver driver) {
        super(driver);
        resultsPageLocators = new Locators.ResultsPageLocators();
    }

    public void findFlightsAmount() {
        wait.until(visibilityOfElementLocated(resultsPageLocators.flightDetails));
        List<WebElement> flightDetails = driver.findElements(resultsPageLocators.flightDetails);
        System.out.println("Available flights: " + flightDetails.size());
    }

    public void findPriceWithLeastStops() {
        String lowPrice = driver.findElement(resultsPageLocators.lowPrice).getText();
        System.out.println("The lowest price with least stops: " + lowPrice + "\n");
    }

    public void selectFlight() {
        wait.until(visibilityOfElementLocated(resultsPageLocators.selectBtn));
        click(resultsPageLocators.selectBtn);
        click(resultsPageLocators.selectFare);

        wait.until(visibilityOfElementLocated(resultsPageLocators.selectSecondBtn));
        click(resultsPageLocators.selectSecondBtn);
        click(resultsPageLocators.selectSecondFare);

        wait.until(visibilityOfElementLocated(resultsPageLocators.selectThirdBtn));
        click(resultsPageLocators.selectThirdBtn);
        click(resultsPageLocators.selectThirdFare);
    }
}
