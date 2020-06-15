package utils;

import org.openqa.selenium.By;

public class Locators {

    /********************************************* Home Page *******************************************/

    public static class HomePageLocators {

        public By flightsBtn = By.id("tab-flight-tab-hp");
        public By multiCityBtn = By.id("flight-type-multi-dest-label-hp-flight");

        public By adultsDropDown = By.id("flight-adults-hp-flight");
        public By adultsValueDropDown = By.xpath("//select[@id='flight-adults-hp-flight']//option[contains(text(),'2')]");

        public By childrenDropDown = By.id("flight-children-hp-flight");
        public By childrenValueDropDown = By.xpath("//select[@id='flight-children-hp-flight']//option[contains(text(),'2')]");

        public By firstChildrenAgeDropDown = By.id("flight-age-select-1-hp-flight");
        public By secondChildrenAgeDropDown = By.id("flight-age-select-2-hp-flight");
        public By firstChildrenAgeValue = By.xpath("//div[@class='cols-nested children-data gcw-toggles-fields available-for-flights']//label[1]//select[1]//option[4]");
        public By secondChildrenAgeValue = By.xpath("//fieldset[@class='room-data not-room-in-package']//label[2]//select[1]//option[12]");

        public By addFlightBtn = By.id("add-flight-leg-hp-flight");

        public By departureFirst = By.id("flight-origin-hp-flight");
        public By departureSecond = By.id("flight-2-origin-hp-flight");
        public By departureThird = By.id("flight-3-origin-hp-flight");

        public By destinationFirst = By.id("flight-destination-hp-flight");
        public By destinationSecond = By.id("flight-2-destination-hp-flight");
        public By destinationThird = By.id("flight-3-destination-hp-flight");

        public By departureDateFirst = By.id("flight-departing-single-hp-flight");
        public By departureDateSecond = By.id("flight-2-departing-hp-flight");
        public By departureDateThird = By.id("flight-3-departing-hp-flight");
        public By closeBtn = By.xpath("//button[contains(@class,'datepicker-close-btn close')]");

        public By searchBtn = By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/div[2]/div/div[1]/div/section[1]/form/div[8]/label/button");
    }

    /********************************************* Results Page *******************************************/

    public static class ResultsPageLocators {

        public By flightDetails = By.className("show-flight-details");
        public By lowPrice = By.xpath("//fieldset[@id='stops']//div[3]//div[1]//div[1]//div[1]");

        public By selectBtn = By.xpath("/html/body/div[2]/div[12]/section/div/div[11]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button");
        public By selectFare = By.xpath("/html/body/div[2]/div[12]/section/div/div[11]/ul/li[1]/div[2]/div/div/div/div[1]/button");

        public By selectSecondBtn = By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]");
        public By selectSecondFare = By.xpath("/html/body/div[2]/div[12]/section/div/div[11]/ul/li/div[2]/div/div/div/div[1]/button");

        public By selectThirdBtn = By.xpath("/html/body/div[2]/div[12]/section/div/div[11]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button");
        public By selectThirdFare = By.xpath("/html/body/div[2]/div[12]/section/div/div[11]/ul/li[1]/div[2]/div/div/div/div[1]/button");
    }

    /********************************************* Flight Information Page *******************************************/

    public static class FlightDetailsPageLocators {
        public By fromCityA = By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/section[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]");
        public By toCityB = By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/section[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]");

        public By fromCityB = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[2]/div/div/div[1]/div[2]/div[2]");
        public By toCityC = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[2]/div/div/div[1]/div[2]/div[4]");

        public By fromCityC = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[3]/div/div/div[1]/div[2]/div[2]");
        public By toCityA = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[3]/div/div/div[1]/div[2]/div[4]");

        public By firstDate = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[1]/div/div/div[1]/div[1]");
        public By secondDate = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[2]/div/div/div[1]/div[1]");
        public By thirdDate = By.xpath("/html/body/main/div/div[1]/section[2]/div[6]/div[3]/div/div/div[1]/div[1]");
    }
}


