package jan2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckingCheckbox {
public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	WebElement checkbox=driver.findElement(By.id("remember"));
	//verify check box is active or not
	boolean value=checkbox.isSelected();
	System.out.println(value);
//verify checkbox iss selected or not 
if(checkbox.isSelected())
{
	//uncheck
	checkbox.click();
}
else
{
	//check in
	checkbox.click();
}
Thread.sleep(6000);
driver.close();

	}

}











