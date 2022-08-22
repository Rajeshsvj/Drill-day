package Mavenproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class tasktest {
	  public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.msedgedriver","msedgedriver.exe");
	        WebDriver driver=new EdgeDriver();
	        driver.navigate().to("https://demoqa.com/automation-practice-form");
	        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Boss");
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).click();
	        driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("The Boss");
	  }
	}

