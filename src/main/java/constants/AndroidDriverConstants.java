package constants;

import java.io.File;

public interface AndroidDriverConstants {

  String ANDROID = "Android";
  String GAME_TV_APK_PATH =
      System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
          + File.separator + "resources" + File.separator + "game.tv_base.apk";
  int NEW_COMMAND_TIMEOUT = 60 * 2;
}
