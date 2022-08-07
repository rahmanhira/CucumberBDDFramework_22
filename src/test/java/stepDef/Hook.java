package stepDef;


//This is a configuration class and inside this we want something to start before the test runs

import base.setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;


public class Hook extends setup {
    static String url;
    static String baseURL = System.getProperty("env");
    static String browserType = System.getProperty("browser");

    public static String existingStudentEmail;
    public static String existingStudentPassword;
    // default browser and env
    static String defaultBrowser = "ch";
    static String defaultEnv = "qa";

    @Before
    public void openBrowser(){
        if (Strings.isNullOrEmpty(browserType)){
            browserType = "ch";
        }
        if (Strings.isNullOrEmpty(baseURL)){
            baseURL = "qa";
        }
        driver = setupBrowser(browserType);
        switch (baseURL){
            case "qa":

                 url = "http://qa.taltektc.com";
                existingStudentEmail ="qaenv@gmail.com";
                existingStudentPassword = "Te$t1234";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                existingStudentEmail =" ";
                existingStudentPassword = " ";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                existingStudentEmail =" ";
                existingStudentPassword = " ";
                break;
        }

        driver.get(url);
    }
    @After
    public void tearDown(Scenario scenario){
        try{
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
                System.out.println(scenario.getName());
            }
        } finally {
           // driver.quit();
        }
    }
}