package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StartChrome3 {

    WebDriver driver;

    @Test
    public void verifyLoginSucceess() {
        driver = new ChromeDriver();
 //       driver= new firefoxDriver();
//        driver= new EdgeDriver();
//        driver= new SafariDriver()
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String ProdutText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        Assert.assertEquals(ProdutText, "Products");

        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        driver.findElement(By.id("add-to-cart")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Hlahla");
        driver.findElement(By.id("last-name")).sendKeys("Mthombeni");
        driver.findElement(By.id("postal-code")).sendKeys("1686");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();









    }

}
