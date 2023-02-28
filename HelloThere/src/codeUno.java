import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class codeUno {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebdriver\\chromedriver110\\chromedriver.exe");

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		//driver = new ChromeDriver(options);
		
		
		
		
		//WebElement clickProfile =  driver.findElement(By.xpath("xpath=//a[contains(text(),'masuk')]"));
		//clickProfile.click();
//		System.out.println("accessing login page");
//		WebElement masuk= driver.findElement(By.linkText("masuk"));
//		System.out.println("success");
//		masuk.click();
//		Thread.sleep(8000);
//		System.out.println("entering email");
//		WebElement enterEmail= driver.findElement(By.id("email"));
//		System.out.println("email success");
//		enterEmail.click();
//		enterEmail.sendKeys("muhammads1994@gmail.com");
//		Thread.sleep(8000);
//		System.out.println("entering password");
//		WebElement enterPassword= driver.findElement(By.id("password"));
//		System.out.println("password success");
//		enterPassword.click();
//		enterPassword.sendKeys("dinS@71adm");
		
		while(true) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.adidas.co.id/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("masuk")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("everysaldisubscription@gmail.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("dinS@71adM");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kata Sandi'])[1]/following::button[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Akun Saya'])[2]/following::span[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Informasi Pribadi'])[2]/following::span[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your Preferences'])[3]/following::span[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Informasi Pribadi'])[2]/following::span[1]")).click();	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='selamat datang kembali saldi'])[1]/following::figcaption[1]")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BARU'])[3]/following::div[6]")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ukuran'])[1]/following::*[name()='svg'][1]")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='US'])[1]/following::button[10]")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tambah ke Keranjang'])[1]/following::*[name()='svg'][1]")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Lihat Bag'])[1]/following::*[name()='svg'][1]")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tersedia'])[1]/following::span[1]")).click();
	    Thread.sleep(15000);
	    driver.close();
	    driver.quit();


		}
		

	}

}