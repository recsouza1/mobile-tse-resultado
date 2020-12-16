package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.DriverManager;

public class Hooks {

    @Before
    public static void setUp() {
        DriverManager.getDriver();
    }

    @After
    public static void tearDown() {
        DriverManager.closeDriver();
    }
}