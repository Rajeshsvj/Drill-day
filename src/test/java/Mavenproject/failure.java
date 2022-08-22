package Mavenproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class failure {
	public static void main(String[] args) throws Exception {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    ChromeDriver driver = new ChromeDriver(option);
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    WebElement ele1 = driver.findElement(By.xpath("//input[@name='firstName']"));
	    ele1.sendKeys("Rajesh");
	    System.out.println(ele1.getText());
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("S",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("987865821",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Abc1234@gmail.com",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Chennai",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("620013",Keys.TAB);
	    WebElement drop = driver.findElement(By.xpath("//select//option[13]"));
	    drop.click();
	    //Select drop1 = new Select(drop);
	    //drop1.selectByValue("AUSTRALIA");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rajeshs",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("",Keys.TAB);
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("",Keys.TAB);
	    for(int i=2;i<=9;i++) {
            String text = driver.findElement(By.xpath("//td/form//tr["+i+"]")).getText();
            System.out.println(text);
            if(i==8) {
                   break;
            }
	    }
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    WebDriver driver1=new EdgeDriver();
        JavascriptExecutor j = (JavascriptExecutor) driver1;
        driver1.navigate().to("https://demo.guru99.com/test/newtours/register.php");
        File registrationpage=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(registrationpage, new File("Screenshot.png"));
}
}


