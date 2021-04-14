package hooks;

import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;



    public class Hooks {
    @Before
    public void initDriver() throws InterruptedException {
        DriverManager.createDriver();
    }

    @After
    public void quiteBrowser() throws InterruptedException {
        DriverManager.quiteDriver();
    }
}