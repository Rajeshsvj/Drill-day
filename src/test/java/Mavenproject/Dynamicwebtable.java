package Mavenproject;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
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
public class Dynamicwebtable {



   public static void main(String[] args) throws InterruptedException, ParseException {



       System.setProperty("webdriver.msedge.driver","C:\\Users\\balakumar\\eclipse-workspace\\Navi\\msedgedriver.exe");



        WebDriver wd=new EdgeDriver();
         wd.get("http://demo.guru99.com/test/web-table-element.php");
         String max;
         double m=0,r=0;
           //No. of Columns
            List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
            System.out.println("Total No of columns are : " +col.size());
            //No.of rows
            List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
            System.out.println("Total No of rows are : " + rows.size());
            for (int i =1;i<rows.size();i++)
            {    
                max= wd.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
                NumberFormat f =NumberFormat.getNumberInstance();
                Number num = f.parse(max);
                max = num.toString();
                m = Double.parseDouble(max);
                if(m>r)
                 {    
                    r=m;
                 }
            }
            System.out.println("Maximum current price is : "+ r);
}



   
}
