package Mavenproject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouseclass {
	
	   public static void main(String[] args) throws InterruptedException {



	       System.setProperty("webdriver.msedge.driver","C:\\Users\\balakumar\\eclipse-workspace\\Navi\\msedgedriver.exe");



	        WebDriver driver1=new EdgeDriver();
	         JavascriptExecutor j = (JavascriptExecutor) driver1;
	         driver1.navigate().to("https://www.google.com/");
	         driver1.manage().window().maximize();
	         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         Actions acc = new Actions(driver1);
	            WebElement txtUsername = driver1.findElement(By.name("q"));
	            org.openqa.selenium.interactions.Action seriesOfActions = acc
	                .moveToElement(txtUsername)
	                .click()
	                .keyDown(txtUsername, Keys.SHIFT)
	                .sendKeys(txtUsername, "hello")
	                .keyUp(txtUsername, Keys.SHIFT)
	                .doubleClick(txtUsername)
	                .contextClick()
	                .build();
	                
	            seriesOfActions.perform() ;
	}



	   
	}
