package dinky_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class first_class {
	
	    @Test
	    public void testNGAsserts() throws Exception{
	        

	        //To Open with Chrome Driver
	            	System.setProperty("webdriver.chrome.driver", "C://Users//Dinky//Downloads//chromedriver_win32 new//chromedriver.exe");
	    	        ChromeDriver driver = new ChromeDriver();
	                driver.get("https://demoqa.com/");
	                // for the site
	                String actualTitle = "ToolsQA";
	                //title on the site
	                Assert.assertEquals(driver.getTitle(), actualTitle);
	                System.out.println("Actual Title :"+ " "+actualTitle);
	    	        System.out.println("Expected Title :"+" "+driver.getTitle());
	                WebElement logo = driver.findElement(By.className("banner-image") );
	                Assert.assertEquals(true, logo.isDisplayed());
	                //checking if the logo is displayed or not
	                System.out.println("Logo Test Case Passed");
	                //statement if it is correct


	                driver.close(); //to close the driver
	            }

	        }
	   
