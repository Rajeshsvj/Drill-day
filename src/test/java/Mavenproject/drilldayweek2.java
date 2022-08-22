package Mavenproject;
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notifications");
    ChromeDriver driver = new ChromeDriver(option);
    driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    WebElement ele1 = driver.findElement(By.xpath("//input[@name='firstName']"));
    ele1.sendKeys("Mathi");
    System.out.println(ele1.getText());
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Maran",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6383585161",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Abcd1234@gmail.com",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("trichy",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Trichy",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("620013",Keys.TAB);
    WebElement drop = driver.findElement(By.xpath("//select//option[13]"));
    drop.click();
    //Select drop1 = new Select(drop);
    //drop1.selectByValue("AUSTRALIA");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mathimaranr",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@1234",Keys.TAB);
    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Abcd@1234",Keys.TAB);
    for(int i=1;i<=9;i++) {
        String text = driver.findElement(By.xpath("(//td/form//tr//td/input[1])["+i+"]")).getText();
        System.out.println(text);
        if(i==8) {
            break;
        }
    }
    driver.findElement(By.xpath("//input[@name='submit']")).click();
    List<WebElement> ele3 = driver.findElements(By.xpath("((//td/p)/font[1])"));
    ele3.size();
    for(int j=1;j<=ele3.size();j++) {
        WebElement ele4 = driver.findElement(By.xpath("((//td/p)/font[1])["+j+"]"));
        String text = ele4.getText();
        System.out.println(text);
    }
}
}
