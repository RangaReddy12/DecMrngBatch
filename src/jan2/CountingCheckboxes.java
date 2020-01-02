package jan2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountingCheckboxes {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///D:/checkbox_1.html");
		driver.manage().window().maximize();
//get collection of checkboxes which are store into type 
List<WebElement>Olist=driver.findElements(By.tagName("input"));
System.out.println("No of checkboxes are::"+Olist.size());
for(int i=0;i<Olist.size();i++)
{
//get each checkbox name which is stored into value property
String checkboxname=Olist.get(i).getAttribute("value");
System.out.println(checkboxname);
//verify which checkbox is active and inactive
boolean value=Olist.get(i).isSelected();
System.out.println("Checkbox active or inactive::"+value);
//verify which checkbox is active or inactive
if(Olist.get(i).isSelected())
{
	//uncheck checkbox
	Olist.get(i).click();
}
else
{
	//check checkbox
	Olist.get(i).click();
}
Thread.sleep(6000);

}
Thread.sleep(6000);
driver.close();
	}
}













