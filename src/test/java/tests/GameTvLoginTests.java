package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GameTvLoginPage;

public class GameTvLoginTests extends BaseSuite {

  GameTvLoginPage gameTvLoginPage;

  @Test(description = "Twitter login verification")
  public void verifyTwitterLogin() {
    GameTvLoginPage gameTvLoginPage = new GameTvLoginPage(driver);
    explicitWait(10, gameTvLoginPage.getTwitterButton());
    gameTvLoginPage.clickOnTwitterButton();
    explicitWait(10, gameTvLoginPage.getUserNameOrEmailField());
    gameTvLoginPage.enterEmailId("tes1.auto1@gmail.com");
    gameTvLoginPage.enterPassword("game@twitter");
    gameTvLoginPage.clickOnAuthorizeApp();
    explicitWait(25, gameTvLoginPage.getGameTvHeadingElement());
    Assert.assertTrue(gameTvLoginPage.checkGametvHeading(), "Game tv heading is not present");
    Assert.assertTrue(gameTvLoginPage.checkHamburgerIcon(), "Game tv hamburger is not present");
  }

}
