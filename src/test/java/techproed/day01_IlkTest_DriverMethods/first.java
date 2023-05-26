package techproed.day1_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://techproeducation.com");
        /*
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        //setProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerini girerek "value"ya ulasabilirim

         */



    }
}
