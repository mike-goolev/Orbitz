package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlightDetails;
import pages.HomePage;
import pages.ResultsPage;
import utils.Screenshot;


public class Flights extends BaseTest {
    private HomePage homePage;
    private ResultsPage resultsPage;
    private FlightDetails flightDetails;

    @BeforeClass(alwaysRun = true)
    public void preconditions() {
        System.out.println("\nExecuting preconditions for " + this.getClass().getName() + "...\n");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
        flightDetails = new FlightDetails(driver);
    }

    @Test
    public void flightSearch() {
        /* Navigate to orbitz.com */
        homePage.loadHomePageByURL();

        /* Select Flight tab */
        homePage.selectFlightTab();

        /* Select Multicity option */
        homePage.selectMulticityOption();

        /* Use search for 2 adults */
        homePage.selectAdults();

        /* Use search for 2 children */
        homePage.selectChildren();

        /* Specify children age */
        homePage.specifyChildrenAge();

        /* Click on add more flights */
        homePage.addFlights();

        /* Enter three flights such that they close the loop */
        homePage.enterDepartureA("Austin");
        homePage.enterDestinationB("Chicago");
        homePage.enterDepartureB("Chicago");
        homePage.enterDestinationC("Boston");
        homePage.enterDepartureC("Boston");
        homePage.enterDestinationA("Austin");

        /* Specify travel dates */
        homePage.enterFirstDate("09/07/2020");
        homePage.enterSecondDate("09/10/2020");
        homePage.enterThirdDate("09/27/2020");

        /* Submit the search */
        homePage.submitSearch();

        /* Find out how many results available */
        resultsPage.findFlightsAmount();

        /* Decide which option is the lowest price with least stops */
        resultsPage.findPriceWithLeastStops();

        /* Select flight with no extra cost */
        resultsPage.selectFlight();

        /* Switch to new window opened */
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        /* Validate departures and destinations of the tickets */
        Assert.assertEquals(flightDetails.validateLocationFromA(), "Austin (AUS)");
        Assert.assertEquals(flightDetails.validateLocationToB(), "Chicago (ORD)");

        Assert.assertEquals(flightDetails.validateLocationFromB(), "Chicago (ORD)");
        Assert.assertEquals(flightDetails.validateLocationToC(), "Boston (BOS)");

        Assert.assertEquals(flightDetails.validateLocationFromC(), "Boston (BOS)");
        Assert.assertEquals(flightDetails.validateLocationToA(), "Austin (AUS)");

        /* Validate flight dates */
        Assert.assertEquals(flightDetails.validateFirstFlightDate(), "Mon, Sep 7");
        Assert.assertEquals(flightDetails.validateSecondFlightDate(), "Thu, Sep 10");
        Assert.assertEquals(flightDetails.validateThirdFlightDate(), "Sun, Sep 27");
    }

    @AfterMethod(alwaysRun = true)
    public void methodTearDown(ITestResult result) {
        if ((!result.isSuccess()) || (result.getStatus() == 3)) {
            Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
        }
        Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
    }
}
