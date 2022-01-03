package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;



public final class ReadPropertyFile {

    //p//Private constructor
    private ReadPropertyFile(){}

    //make static file to capture properties file


    private  static Properties properties=new Properties();


    static {

        FileInputStream fs = null;
        try {
            fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/config/config.properties");
            properties.load(fs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // properties.load(fs);
    }



    public static String getValue(String key) throws Exception {
        String value = "";


        // wrong url and input keyws  pass the key as string
        value = properties.getProperty(key);
        if (Objects.isNull(value)) {
            throw new Exception("Property name " + key + " is not found.Please check the config");
        }
        return value;
    }
}
