package driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    //add construct
    private  DriverManager(){}

    private  static ThreadLocal<WebDriver>dr=new ThreadLocal<WebDriver>();
    public static WebDriver getDriver(){
        return dr.get();
    }

    public  static void setDriver(WebDriver setRef){
         dr.set(setRef);
    }

    public static void unload(){
        dr.remove();
    }
}
