package Mavenproject;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;
public class Screenshot {


	

	public static void main(String[] args) throws InterruptedException, IOException {

	        System.setProperty("webdriver.msedge.driver","C:\\Users\\balakumar\\eclipse-workspace\\Navi\\msedgedriver.exe");

	         WebDriver driver1=new EdgeDriver();
	         JavascriptExecutor j = (JavascriptExecutor) driver1;
	         driver1.navigate().to("https://askomdch.com/store");
	         File Homepage=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	         FileHandler.copy(Homepage, new File("Screenshot.png"));

	         /* j.executeScript("window.scrollBy(0,660)");
	          driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	          
	          driver1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[8]/div[2]/a[2]")).click();
	          j.executeScript("window.scrollBy(0,-660)");
	          j.executeScript("window.scrollBy(0,660)");
	          Thread.sleep(5000);
	          driver1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[8]/div[2]/a[3]")).click();
	          Thread.sleep(5000);
	          driver1.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();*/
	          
	}
}

