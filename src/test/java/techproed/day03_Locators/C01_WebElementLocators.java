package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://www.amazon.com");

        // aramakutusunu locate ediniz ve Nutella aratınız

       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        /*
        Eger bir "webelement"i birden fazla kez kullanmayacaksaniz bir "WebElement"e assign etmeyebilirsiniz.
      //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);

        Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
        Webelement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        1-Locate işlemi bittikten sonra webelemente bir metin göndereceksek sendKeys() methodu kullanırız.
         2-Webelement'e tıklayacaksak click() methodu kullanırız
        3-Webelement'in üzerindeki yazıyı almak istiyorsak getText()methodunu kullanırız.
 */


        Thread.sleep(2000);

        // sayfayı kapatınız
        driver.close();


    }
}
