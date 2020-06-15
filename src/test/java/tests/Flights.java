package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Screenshot;


public class Flights extends BaseTest {
    private HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void preconditions() {
        System.out.println("\nExecuting preconditions for " + this.getClass().getName() + "...\n");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        homePage = new HomePage(driver);

    }

    @Test
    public void flightSearch() {
        homePage.loadHomePageByURL();

        homePage.selectFlightTab();

        homePage.selectMulticityOption();

        homePage.selectAdults();

        homePage.selectChildren();

        homePage.specifyChildrenAge();

        homePage.addFlights();

        homePage.enterFirstDeparture("Austin");
        homePage.enterFirstDestination("Chicago");
        homePage.enterSecondtDeparture("Chicago");
        homePage.enterSecondDestination("Boston");
        homePage.enterThirdDeparture("Boston");
        homePage.enterThirdDestination("Austin");

        homePage.enterFirstDate("07/07/2020");
        homePage.enterSecondDate("07/10/2020");
        homePage.enterThirdDate("07/27/2020");

        homePage.submitSearch();

    }

    @AfterMethod(alwaysRun = true)
    public void methodTearDown(ITestResult result) {
        if ((!result.isSuccess()) || (result.getStatus() == 3)) {
            Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
        }
        Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
    }
}
