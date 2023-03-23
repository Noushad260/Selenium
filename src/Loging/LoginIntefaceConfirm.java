package Loging;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class LoginIntefaceConfirm {
      @Test
	public void Logmodules() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://localhost/avactis.4.6.Next/avactis-system/admin/index.php");
		String sign = driver.findElement(By.xpath("//td[text()='Sign In']")).getText();
		System.out.println("Login interface Available  " + sign);
		//Assert.assertEquals(sign, "Sign In");
		SoftAssert soft = new SoftAssert();
		driver.findElement(By.name("AdminEmail")).sendKeys("noushad12@gmail.com", Keys.TAB + "Noushad12@");
		driver.findElement(By.id("SignInButton1")).click();
		String actual = driver.findElement(By.xpath("//td[text()='Home']")).getText();
		System.out.println(actual);
//		System.out.println("1 valide UN and PWD is working "+Home);
		//Assert.assertEquals(Home, "Home");
		String expected = "Homee";
		
		soft.assertEquals(actual, expected);
		System.out.println("hfgj");

	}

}
