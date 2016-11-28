package Helpers.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {
    private static WebDriver _driver;

    public static WebDriver GetInstance(){
        if (_driver == null)
        { _driver = new FirefoxDriver();
        }
        return _driver;
    }
    public BaseDriver() {
        _driver = new FirefoxDriver();
    }

    public String BaseUrl()
    {
        return "http://localhost:8080/";
    }
}
