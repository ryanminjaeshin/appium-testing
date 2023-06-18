package ryan.Appium2;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("ryanphone");
		options.setApp("//Users//ryanshin//eclipse-workspace//Appium2//src//test//java//resources//ApiDemos-debug.apk");
		
		// first argument => Appium server port
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.quit();
	}

}
