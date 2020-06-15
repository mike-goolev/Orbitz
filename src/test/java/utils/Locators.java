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
}


