package ryan.Appium2;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		// first argument => Appium server port
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), null);
	}

}
