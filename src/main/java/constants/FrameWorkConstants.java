package constants;

public class FrameWorkConstants {

    // create private constants
    private FrameWorkConstants(){}
    private static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe";
    private static final String CONFIGFILEPATH=System.getProperty("user.dir")+"/src/test/config/config.properties";

    private static final int WAITTIMEINSECONDS=10;
    public static int getWaittimeinseconds(){
        return WAITTIMEINSECONDS;
    }
    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
    public static String getConfigfilepath() {
        return CONFIGFILEPATH;
    }



}
