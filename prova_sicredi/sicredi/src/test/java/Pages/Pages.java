package Pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pages {
	WebDriver driver;
	public void clicar(By elemento) {
		driver.findElement(elemento).click();	
		
	}
	public void preencher(By elemento , String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void pausa (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

public void validarTexto(String texto, By elemento) {
	String mensagem = driver.findElement(elemento).getText();	
	System.out.println(mensagem);
	assertEquals(texto, mensagem);
}
public void screnShoot(String print) throws IOException {

	TakesScreenshot scrShot = ((TakesScreenshot) driver);
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile = new File(print);
	FileUtils.copyFile(SrcFile, DestFile);
	
}
public void fecharBrowser(String descricaoPasso) throws IOException {
	
		driver.quit();
}
public void ExecutarNavegador(String url) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();		
}	
	public void scroll(By elemento) throws InterruptedException {
		WebElement element = driver.findElement((elemento));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		element.click();
	

}
public void url() {
	System.out.println("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
}
}