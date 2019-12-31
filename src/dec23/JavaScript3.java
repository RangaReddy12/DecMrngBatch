package dec23;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript3 {
public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location='http://primusbank.qedgetech.com/'");
	driver.manage().window().maximize();
	js.executeScript("document.getElementById('txtuId').value='Admin'");
	js.executeScript("document.querySelector('#txtPword').value='Admin'");
	js.executeScript("document.querySelector('#login').click()");
String Expval="adminflow";
String Acturl=js.executeScript("return document.URL").toString();
if(Acturl.contains(Expval))
{
	System.out.println("Login Success");
}
else
{
	System.out.println("Login Fail");
}
Thread.sleep(7000);
driver.close();
	}

}





