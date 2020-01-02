package jan2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethods {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
WebElement reentermail=driver.findElement(By.id("u_0_u"));
boolean value=reentermail.isDisplayed();
System.out.println(value);
	}

}
