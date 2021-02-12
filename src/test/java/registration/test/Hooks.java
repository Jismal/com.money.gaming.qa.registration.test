package registration.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    DriverFactory driverFactory = new DriverFactory();

    //Hooks deals with initialisation and tear down actions
    @Before

    public void setUp() {
        driverFactory.openBrowser();
        driverFactory.navigateTo("https://moneygaming.qa.gameaccount.com/");
        driverFactory.manageBrowser();
    }


    @After
    public void tearDown() {
        driverFactory.closeBrowser();
    }
}
