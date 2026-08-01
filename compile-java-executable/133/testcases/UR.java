import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class ur {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ur() {
		tg.openDevice();
		tg.activateApp("com.android.chrome");
				tg.wait("ele_homebuttonImageButton1785583934214", ComparisonType.IS_VISIBLE);
				tg.click("ele_homebuttonImageButton1785583934214", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1785583938635", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchGoogleortypeURLEditText1785583938635", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1785583943832", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchGoogleortypeURLEditText1785583943832", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1785583943832", ComparisonType.IS_VISIBLE);
				tg.type("ele_SearchGoogleortypeURLEditText1785583943832", "https://github.com/login", false);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
		END_CUSTOM_SCRIPT;
				tg.wait("ele_EditText1785584155603", ComparisonType.IS_VISIBLE);
				tg.click("ele_EditText1785584155603", 1);
				tg.wait("ele_EditText1785584155603", ComparisonType.IS_VISIBLE);
				tg.type("ele_EditText1785584155603", "upendra.goswami@testgrid.io", true);
				tg.wait("ele_EditText1785584167861", ComparisonType.IS_VISIBLE);
				tg.click("ele_EditText1785584167861", 1);
				tg.wait("ele_EditText1785584167861", ComparisonType.IS_VISIBLE);
				tg.type("ele_EditText1785584167861", "Goswami@720", true);
				tg.wait("ele_SigninButton1785584177400", ComparisonType.IS_VISIBLE);
				tg.click("ele_SigninButton1785584177400", 1);
				tg.wait("ele_EditText1785584479756", ComparisonType.IS_VISIBLE);
				tg.click("ele_EditText1785584479756", 1);
				tg.wait("ele_EditText1785584479756", ComparisonType.IS_VISIBLE);
				tg.type("ele_EditText1785584479756", "1234", true);
				tg.wait("ele_VerifyButton1785584489455", ComparisonType.IS_VISIBLE);
				tg.click("ele_VerifyButton1785584489455", 1);
				tg.wait(5);
		tg.close();
	}
}