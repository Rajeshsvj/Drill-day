package Mavenproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.msedge.driver","C:\\Users\\balakumar\\eclipse-workspace\\Navi\\msedgedriver.exe");

         WebDriver driver1=new EdgeDriver();
         JavascriptExecutor j = (JavascriptExecutor) driver1;
         driver1.navigate().to("https://demoqa.com/alerts");
         driver1.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
         Alert alert = driver1.switchTo().alert();
         Thread.sleep(6000);
         alert.accept();
         /* j.executeScript("window.scrollBy(0,660)");
          driver1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[8]/div[2]/a[2]")).click();
          j.executeScript("window.scrollBy(0,-660)");
          j.executeScript("window.scrollBy(0,660)");
          Thread.sleep(5000);
          driver1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[8]/div[2]/a[3]")).click();
          Thread.sleep(5000);
          driver1.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();*/
          
}           
}