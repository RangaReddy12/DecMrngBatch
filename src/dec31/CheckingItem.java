package dec31;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CheckingItem {
	public static void main(String[] args) {
		String Expitem="books";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));	
		
		//get collection of items
		List<WebElement>listitems=listbox.getOptions();
		System.out.println("no of items are::"+listitems.size());
		for(int i=1;i<listitems.size();i++)
		{
			String eachitem=listitems.get(i).getText();
			System.out.println(eachitem);
			//verify exp item equals to each item in listbox
			if(eachitem.equalsIgnoreCase(Expitem))
			{
				//when expitem equals to each item exit loop
				itemexist=true;
				break;
			}
		}
		//item exist is boolean type if it true run condition or execute else part
		if(itemexist)
		{
			System.out.println("Item Found in ListBox::"+Expitem);
		}
		else
		{
			System.out.println("Item Not Found in ListBox::"+Expitem);	
		}
	}

}












