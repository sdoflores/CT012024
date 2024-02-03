package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Obtener objetos/WebElements de la pagina web
		WebElement userName =  driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//Hacer Login
		userName.sendKeys("standard_user");
		Thread.sleep(500);
		password.sendKeys("secret_sauce");
		Thread.sleep(500);
		loginBtn.click();
		
		/*
		//Metodos del explorador
		//obtener el titulo de una pagina
		String tittle = driver.getTitle();
		System.out.println("El titulo de la patina es: "+tittle);
		
		//Obtener la URL
		String url = driver.getCurrentUrl();
		System.out.println("La url actual es: "+url);
		
		//Metodos de navegacion
		driver.navigate().back();
		System.out.println("Entra aquí");
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("Entra aquí tambien");
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("Aca tambien");
		
		//Verifica elemento desplegado en la pagina
		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(product) {
			System.out.println("El articulo es desplegado");
		}
		
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();//Contains es un metodo de JAVA que evalua 2 Strings
		boolean textCorrect = prodText.contains("Sauce Labs Backpack");
		
		if(textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else System.err.println("ERROR: El producto no es el correcto");
		*/
		
		//Dropdown
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("lohi");
		//driver.close(); //Cierra la ventana actual con la que se esta interactuando
		driver.quit();  //Cierra todas las ventanas o pestañas que se abrieron
	}

}
