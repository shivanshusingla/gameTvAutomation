package tests;

import driverinitialization.AndroidDriverInitialization;
import driverinitialization.AppiumServerInitialization;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseSuite {

  AndroidDriverInitialization driverInitialization = new AndroidDriverInitialization();
  AppiumServerInitialization appiumServerInitialization = new AppiumServerInitialization();
  AppiumDriver<MobileElement> driver;

  @BeforeSuite(description = "1. Launch attached gitTrending application and Start Appium Driver")
  public void startAppiumDriver() {
    driver = driverInitialization.startAppiumDriver();
  }

  @AfterTest(description = "Stop Appium Driver", alwaysRun = true)
  public void stopAppiumDriver() {
    driver.quit();
  }

  @AfterSuite(description = "Stop Appium Server", alwaysRun = true)
  public void stopAppiumServer() {
    Runtime.getRuntime().addShutdownHook(new Thread() {
                                           public void run() {
                                             appiumServerInitialization.stopAppiumServer();
                                           }
                                         }
    );
  }

  public void explicitWait(int time, AndroidElement androidElement) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(ExpectedConditions.visibilityOf(androidElement));
  }
}
