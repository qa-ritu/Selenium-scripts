import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


@SuppressWarnings("unused")
public class Rams_Add_Article {
	
	@Before
	public void setUp() throws Exception {
				
	}

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Volumes/Data/Users/rdonadkar/Downloads/chromedriver");
		WebDriver Cwd = new ChromeDriver();
				Cwd.get("http://rams-stage.cosmopolitan.com/");
		
		// Log into RAMS
		
		
				Cwd.findElement(By.id("username")).sendKeys("qa1");
				Cwd.findElement(By.id("password")).sendKeys("qa1123");
				Cwd.findElement(By.xpath(".//*[@id='contents']/form/div/p[4]/button")).click();
		
		// Click on add article
		
				Cwd.findElement(By.xpath(".//*[@id='top']/div[2]/a[1]")).click();
		
		//Enter details into the article
		
				Cwd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				Cwd.findElement(By.id("short_title")).sendKeys("This is the index title");
				
				long timestamp = System.currentTimeMillis();
				
				
				
				Cwd.findElement(By.id("title")).sendKeys("Test article "+timestamp);
				Cwd.findElement(By.id("abs")).sendKeys("This is the index teaser");
				Cwd.findElement(By.id("image_id")).sendKeys("134532");
				Cwd.findElement(By.xpath(".//*[@id='imgarticle_id']")).sendKeys("135958");
				new Select(Cwd.findElement(By.id("ad_category_id"))).selectByVisibleText("Fashion");
				Cwd.findElement(By.xpath(".//*[@id='body_box']/div[2]/div/div[2]")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec et lacinia neque. Maecenas suscipit nulla in eros luctus, et lobortis arcu ultrices. Etiam vestibulum interdum mi vitae consectetur. In quis consequat mi, a convallis erat. Vestibulum a facilisis mauris. Vivamus molestie nulla justo, sed vulputate purus fringilla sit amet. Etiam vehicula metus at erat volutpat, eu cursus nunc iaculis. Praesent malesuada mi urna. Mauris augue sem, aliquet quis feugiat vel, congue eu est. Cras quis lorem nec tortor fringilla viverra. Aenean facilisis et ipsum mattis ultricies. ");
				
				
				
				Thread.sleep(2000);
				
				Cwd.findElement(By.xpath(".//*[@id='contents']/form/div/div/div[1]/div[1]/div[2]/div[4]/label/span")).click();
				Thread.sleep(1000);
				Cwd.findElement(By.xpath(".//*[@id='autopublishdate']")).click();
				//Setting auto-publish here
				Cwd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[3]/button[1]")).click();
				//Clicking on done for the auto-publish.
				Cwd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[3]/button[2]")).click();
				Thread.sleep(1000);
				//Click on save draft.
				Cwd.findElement(By.xpath(".//*[@id='contents']/form/div/div/div[1]/div[1]/div[2]/div[7]/button[1]")).click();
				
				String parentWindowHandler = Cwd.getWindowHandle();
				System.out.println(parentWindowHandler);
				//Preview the article.			
				Cwd.findElement(By.xpath(".//*[@id='contents']/form/div/div/div[1]/div[1]/div[1]/h3/button")).click();
				Thread.sleep(5000);
				System.out.println(Cwd.getPageSource());
				
			}
	
	 
	@After
	public void tearDown() throws Exception {
	}

}
