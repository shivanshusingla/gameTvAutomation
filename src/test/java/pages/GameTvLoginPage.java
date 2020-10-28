package pages;

import Wrappers.WrapperMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GameTvLoginPage extends CommonPage {

  WrapperMethods wrapperMethods;

  @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AuthoriseWithTwitter_593\"]")
  private AndroidElement twitterButton;

  @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"username_or_email\"]")
  private AndroidElement userNameOrEmailField;

  @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"password\"]")
  private AndroidElement passwordField;

  @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,\"Authorize app\")]")
  private AndroidElement authorizeAppButton;

  @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Play_Page_Title_503\"]")
  private AndroidElement gameTvHeading;

  @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"SvgPicture_HamburgerIcon_001\"]")
  private AndroidElement gameTvHamburgerIcon;

  public GameTvLoginPage(
      AppiumDriver<? extends MobileElement> driver) {
    super(driver);
  }

  public AndroidElement getTwitterButton() {
    return twitterButton;
  }

  public void clickOnTwitterButton() {
    wrapperMethods.click(twitterButton);
  }

  public AndroidElement getUserNameOrEmailField() {
    return userNameOrEmailField;
  }

  public void enterEmailId(String email) {
    wrapperMethods.enterValue(userNameOrEmailField, email);
  }

  public void enterPassword(String password) {
    wrapperMethods.enterValue(passwordField, password);
  }

  public void clickOnAuthorizeApp() {
    wrapperMethods.click(authorizeAppButton);
  }

  public AndroidElement getGameTvHeadingElement() {
    return gameTvHeading;
  }

  public boolean checkGametvHeading() {
    return wrapperMethods.verifyPresenceOfElement(gameTvHeading);
  }

  public boolean checkHamburgerIcon() {
    return wrapperMethods.verifyPresenceOfElement(gameTvHamburgerIcon);
  }

}
