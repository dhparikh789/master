package supportLibraries;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnvironmentUtilities {

	public static FirefoxDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor javascript;
	public static String dir = System.getProperty("user.dir");

	public static String geckodriver_Path = dir + "/src/main/resources/Drivers/geckodriver";

	public static void environmnetObjects() {

		System.setProperty("webdriver.gecko.driver", geckodriver_Path);

		FirefoxOptions options = new FirefoxOptions();

		options.setAcceptInsecureCerts(true);
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.download.dir", dir + "\\Download");
		options.addPreference("browser.download.defaultFolder", dir + "\\Download");
		options.addPreference("browser.helperApps.neverAsk.saveToDisk",
				"multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png,image/jpeg,application/pdf, text/html,text/plain,  application/excel,application/vnd.ms-excel,application/x-excel,application/x-msexcel,application/download,application/ris,application/octet-stream");
		options.addPreference("browser.download.manager.showWhenStarting", false);
		options.addPreference("browser.download.manager.focusWhenStarting", false);
		options.addPreference("browser.download.useDownloadDir", true);
		options.addPreference("browser.helperApps.alwaysAsk.force", false);
		options.addPreference("browser.download.manager.closeWhenDone", true);
		options.addPreference("browser.download.manager.showAlertOnComplete", false);
		options.addPreference("browser.download.manager.useWindow", false);
		options.addPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
		options.addPreference("pdfjs.disabled", true);

		driver = new FirefoxDriver(options);
		wait = new WebDriverWait(driver, 2400);
		javascript = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
