package Assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs_form {
       public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	
	 driver.get("https://cart.com/contact/sales");
	 driver.manage().window().maximize();
	 WebElement firstname=driver.findElement(By.cssSelector("[name=\"firstname\"]"));
	 firstname.sendKeys("Vishnu");
	 WebElement lastname= driver.findElement(By.cssSelector("[name=\"lastname\"]"));
	 lastname.sendKeys("Rag");
	 WebElement phoneNumber=driver.findElement(By.id("phone-dac8341c-befa-4b14-af02-786eba6a50dd_3346"));
	 phoneNumber.sendKeys("1111111111");
	 WebElement email= driver.findElement(By.xpath("//input[@placeholder=\"Work email\"]"));
	 email.sendKeys("tester@test.com");
	 WebElement company= driver.findElement(By.xpath("//input[@name=\"company\"]"));
	 company.sendKeys("Tester Limited");
	 WebElement Dropdown= driver.findElement(By.id("country-dac8341c-befa-4b14-af02-786eba6a50dd_3346"));
	 
	 Select select=new Select(Dropdown);
	 select.selectByVisibleText("India");
	 driver.findElement(By.cssSelector("[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
	
	 List<WebElement>list=driver.findElements(By.cssSelector("[class=\"hs-form-checkbox-display\"]"));
	 for(WebElement ele: list) {
		 ele.click();
	 }
	 
	 WebElement message=driver.findElement(By.id("contant_message-dac8341c-befa-4b14-af02-786eba6a50dd_3346"));
	 message.sendKeys("This is a Selenium Test");
	 
	 driver.findElement(By.id("i_agree_to_the_terms_of_service-dac8341c-befa-4b14-af02-786eba6a50dd_3346")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("[value='Submit']")).click();
	 
driver.quit();
	
}
}
