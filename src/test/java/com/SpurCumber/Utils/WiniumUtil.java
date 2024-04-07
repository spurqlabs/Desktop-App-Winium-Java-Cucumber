package com.SpurCumber.Utils;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import java.net.URL;
public class WiniumUtil {

    private static WiniumDriver winiumdriver = null;
    private static Process winiumDriverProcess;

    public static WiniumDriver WiniumIniit() {
        try {
            DesktopOptions option = new DesktopOptions();
            option.setApplicationPath("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Word.lnk");
            winiumdriver = new WiniumDriver(new URL("http://localhost:9999"), option);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return winiumdriver;
    }

    public static void WiniumTearDown() {
        if (winiumdriver != null) {
            winiumdriver.quit();
        }
        winiumdriver = null;
    }

    public static void WiniumServerInit() {
        try {
            String driverpath = CommonUtil.getResourceDirPath("Winium.Desktop.Driver.exe");
            String command = driverpath + " -p " + "9999";
            winiumDriverProcess = new ProcessBuilder("cmd.exe", "/c", command).start();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopWiniumDriver() {
        try {
            winiumDriverProcess.destroy();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
