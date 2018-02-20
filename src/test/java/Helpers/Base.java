package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
     public WebDriver driver;
        {
            if (System.getProperty("test").equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\HYS\\Desktop\\CHROME\\CHROMEDRIVER.EXE");
                driver = new ChromeDriver();}
            else if (System.getProperty("test").equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\nelli\\Desktop\\geckodriver.exe");
                driver=new FirefoxDriver();}
            else if (ConfigDataForBrowser.get("driver").equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\nelli\\Desktop\\CHROMEDRIVER.EXE");
                driver = new ChromeDriver();}
            else if (ConfigDataForBrowser.get("driver").equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\nelli\\Desktop\\geckodriver.exe" );
                driver=new FirefoxDriver();}
            else {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\HYS\\Desktop\\CHROME\\CHROMEDRIVER.EXE");
                driver = new ChromeDriver();}
        }




    }
