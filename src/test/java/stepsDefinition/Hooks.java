package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.DriverManager;

public class Hooks {

    @Before
    public static void setUp() {
        if (DriverManager.driver == null) {
            DriverManager.createDriver();
        }
    }

    @After
    public static void tearDown() {
        DriverManager.closeDriver();
    }
}