package techproed.day1_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Sayfa Basligi: "+driver.getTitle());
        driver.get("https://techproeducation.com");
        System.out.println("Techporeducation Sayfa Basligi: "+driver.getTitle());
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());
    }
}
