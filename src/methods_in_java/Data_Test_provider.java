package methods_in_java;


public class Data_Test_provider {
	@Test
public void TestLogin() {
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	@dataprovider()
	public object[][] loginData(){
		
	}
}
