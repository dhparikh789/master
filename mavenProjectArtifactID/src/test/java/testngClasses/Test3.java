package testngClasses;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import supportLibraries.EnvironmentUtilities;

public class Test3 extends EnvironmentUtilities {

	@BeforeClass
	public void beforeClass() throws Exception {

		String sTestName = this.getClass().getSimpleName();
		EnvironmentUtilities.environmnetObjects();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void input() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tablet");
		Thread.sleep(3000);
		
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void enter() throws InterruptedException {
		System.out.println("test3 priority 2 start");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		System.out.println("test3 priority 2 end");
	}

	@AfterClass
	public void afterClass() throws Exception {
		driver.quit();
	}

}
