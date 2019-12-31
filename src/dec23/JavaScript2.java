package dec23;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class JavaScript2 {
public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location='https://www.flipkart.com'");
driver.manage().window().maximize();
Actions ac=new Actions(driver);
ac.sendKeys(Keys.ESCAPE).perform();
Thread.sleep(7000);
//scroll top to bottom
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(7000);
//scroll from bottom to top
js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
Thread.sleep(7000);
WebElement realme=driver.findElement(By.linkText("Payments"));
js.executeScript("window.scrollIntoview",realme);
realme.click();
String pagetitle=js.executeScript("return document.title").toString();
System.out.println(pagetitle);
Thread.sleep(7000);
//scroll vertically to certain pixel
js.executeScript("window.scrollBy(0,900)");
Thread.sleep(7000);
driver.close();
	}

}













