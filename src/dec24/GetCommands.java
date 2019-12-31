package dec24;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCommands {
public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		//print title of the page and length of title
		String pagetitle=driver.getTitle();
		System.out.println("page title is::"+pagetitle);
		System.out.println("page title length is::"+pagetitle.length());
		//print url of the page and length of url
		String strurl=driver.getCurrentUrl();
		System.out.println("page url is=="+strurl);
		System.out.println("page url is=="+strurl.length());
		driver.close();

	}

}
