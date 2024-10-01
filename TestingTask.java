package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTask {
       public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium WithJavaProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		Facebook-https://www.facebook.com/
//		Amazon-https://www.amazon.in/
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("qwerty");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("11223456");
//		WebElement login = driver.findElement(By.name("login"));
//		login.click();
		WebElement create= driver.findElement(By.linkText("Create new account"));
		create.click();
		Thread.sleep(1000);
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("qwerty");
		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys("uiop");
		WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("qwerty098@gmail.com");
		WebElement np = driver.findElement(By.name("reg_passwd__"));
		np.sendKeys("yrewq");
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		 
		
		
//		WebElement name = driver.findElement(By.name("field-keywords"));
//		name.sendKeys("oneplus nord ce2lite 5g");
//		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
//		search.click();
//		WebElement add=driver.findElement(By.className("a-size-base a-color-base"));
//		add.click();
//		driver.close();`
	}
}
