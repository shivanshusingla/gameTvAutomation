package tests;

import org.testng.annotations.Test;
import pages.GameTvLoginPage;

public class GameTvLoginTests extends BaseSuite {

  GameTvLoginPage gameTvLoginPage;

  @Test(description = "Twitter login verification")
  public void verifyTwitterLogin() {
    GameTvLoginPage gameTvLoginPage = new GameTvLoginPage(driver);
    gameTvLoginPage.clickOnTwitterButton();
    gameTvLoginPage.enterEmailId("tes1.auto1@gmail.com");
    gameTvLoginPage.enterPassword("game@twitter");
    gameTvLoginPage.clickOnAuthorizeApp();
  }

}
