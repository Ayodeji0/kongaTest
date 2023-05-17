package com.amazonstore.base;
import com.amazonstore.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static Properties prop;
//    public static WebDriver driver;

//    Declare ThreadLocal Driver
    public static ThreadLocal<RemoteWebDriver> driver= new ThreadLocal<>();
    @BeforeSuite(groups = {"Sanity","Smoke","Regression"})
    public void loadConfig(){
//        I need to create a class in the utility package for either or all of these report method
//        ExtentManager.setExtent();
//        DOMConfigurator.configure("log4j.xml");

        try {
            prop = new Properties();
            System.out.println("constructor invoked");
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "\\Configuration\\Config.properties");
            prop.load(ip);
            System.out.println("driver: " + driver);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static WebDriver getDriver(){

//        get driver from threadlocal map
        return driver.get();
    }


       public  static void launchApp(String browserName) {
        WebDriverManager.chromedriver().setup();
//        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            // driver = new ChromeDriver();
//             Set Browser to ThreadLocalMap
            driver.set(new ChromeDriver());
        } else if (browserName.equalsIgnoreCase("FireFox")) {
//            driver = new FirefoxDriver();
               WebDriverManager.firefoxdriver().setup();
               driver.set(new FirefoxDriver());
        } else if (browserName.equalsIgnoreCase("IE")) {


            WebDriverManager.iedriver().setup();
            driver.set(new InternetExplorerDriver());
        }

     //  TO MAXIMIZE SCREEN
        getDriver().manage().window().maximize();
     // TO DELETE ALL COOKIES
           getDriver().manage().deleteAllCookies();
     // IMPLICIT TIMEOUT
     getDriver().manage().timeouts().implicitlyWait
     (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
           //PAGELOAD TIMEOUT

                  getDriver().manage().timeouts().pageLoadTimeout
                   (Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
       // LAUNCHING URL
           getDriver().get(prop.getProperty("url"));
       }

 @AfterSuite
    public void afterSuite(){
//        ExtentManager.endReport();
 }

}
