package dec27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_GetText {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		//get text of link
	String linkText=driver.findElement(By.partialLinkText("Gm")).getText();	
	String ExpText="gmail";
	if(linkText.equalsIgnoreCase(ExpText))
	{
		System.out.println("LinkText is Matching::"+linkText+"   "+ExpText);
	}
	else
	{
	System.out.println("LinkText is not Matching::"+linkText+"   "+ExpText);
	}
Thread.sleep(5000);
driver.close();
	}
}



