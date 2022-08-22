package Mavenproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
public class javascript {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.msedge.driver","C:\\Users\\balakumar\\eclipse-workspace\\Navi\\msedgedriver.exe");

         WebDriver driver1=new EdgeDriver();
         JavascriptExecutor j = (JavascriptExecutor) driver1;
         driver1.navigate().to("https://askomdch.com/store");

          j.executeScript("window.scrollBy(0,660)");
          driver1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[8]/div[2]/a[2]")).click();
          j.executeScript("window.scrollBy(0,-660)");
          j.executeScript("window.scrollBy(0,660)");
          Thread.sleep(5000);
          driver1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[8]/div[2]/a[3]")).click();
          Thread.sleep(5000);
          driver1.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
          
}           
}