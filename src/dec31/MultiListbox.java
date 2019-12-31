package dec31;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiListbox {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///E:/Multi.html");
		driver.manage().window().maximize();
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		boolean value=dropdown.isMultiple();
		System.out.println(value);
		//select six item from drop down
		dropdown.selectByIndex(0);
		Thread.sleep(5000);
		dropdown.selectByIndex(4);
		Thread.sleep(5000);
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		dropdown.selectByIndex(6);
		Thread.sleep(5000);
		dropdown.selectByIndex(3);
		Thread.sleep(5000);
		dropdown.selectByIndex(8);
		Thread.sleep(5000);
		//count no of items which are are selected
		List<WebElement>items=dropdown.getAllSelectedOptions();
		System.out.println("no of items selected::"+items.size());
		//print items which are selected
		for(int i=0;i<items.size();i++)
		{
			String eachitem=items.get(i).getText();
			System.out.println(eachitem);
		}
		//deselect one by one item from selection
		dropdown.deselectByIndex(0);
		Thread.sleep(5000);
		dropdown.deselectByIndex(4);
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.close();
	}

}













