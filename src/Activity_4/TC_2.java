package Activity_4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC_2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		By uName = By.id("user-name");
        driver.findElement(uName).sendKeys("problem_user");

        By pWord = By.id("password");
        driver.findElement(pWord).sendKeys("secret");

        By loginBtn = By.id("login-button");
        driver.findElement(loginBtn).click();

        By errorMessage = By.xpath("//h3[@data-test='error']");
        String actError = driver.findElement(errorMessage).getText();

        if (actError.contains("Epic sadface")) {
                        System.out.println(" User ID and Password Not Match Message");
                        
        Thread.sleep(5000);
        driver.quit();


	}

}
}

