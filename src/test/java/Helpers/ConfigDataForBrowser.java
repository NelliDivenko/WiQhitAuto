package Helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ConfigDataForBrowser {
    private static Properties PROPERTIES;

//    static {
//        PROPERTIES = new Properties();
//        URL prop = ClassLoader.getSystemResource("config.properties");
//        try {
//            PROPERTIES.load(prop.openStream());
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

    //    public static String get(String key) {
//        PROPERTIES = new Properties();
//        URL prop = ClassLoader.getSystemResource("config.properties");
//        try {
//            PROPERTIES.load(prop.openStream());
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        return PROPERTIES.getProperty(key);
//    }
    public static String get(String propertyName){
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Property file was not find config.properties");
        }

        return prop.getProperty(propertyName);
    }
}
