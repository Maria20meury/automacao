package Metodos;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	public static WebDriver driver;

	public void screnShoot(String print) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File desfile = new File(print);
		FileUtils.copyFile(srcFile, desfile);

	}

	public void pausa(int tempo, String descricaopasso) throws InterruptedException {
		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
		}

	}
	
	public void preencher(By elemento, String texto,String descricaopasso) throws IOException {
		
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
			screnShoot(descricaopasso);
		}
		
		
}
	public void click (By elemento, String descricaopasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
			screnShoot(descricaopasso);
			
		}
		
	}
	public void fecharNavegador (String descricaopasso) throws IOException {
		try {
		driver.quit();	
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "erro no passo" + descricaopasso);
			screnShoot(descricaopasso);
		}
	}
	public void executarnavegador (String url ,String navegador,String descricaopasso) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage() .window() .maximize();
		}
}