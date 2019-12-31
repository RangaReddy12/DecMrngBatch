package dec26;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyUrl {
public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String strprotocol="https://";
		String stractprotocol=driver.getCurrentUrl();
		if(stractprotocol.startsWith(strprotocol))
		{
	System.out.println("Url IS Secured::"+stractprotocol+"   "+strprotocol);
		}
		else
		{
	System.out.println("Url IS UnSecured::"+stractprotocol+"   "+strprotocol);
		}
		}
}
