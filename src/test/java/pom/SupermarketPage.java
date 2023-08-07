package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupermarketPage extends BasePage {
    public SupermarketPage(WebDriver driver) {
        super(driver);
    }

    public void selectSupermarketOption() {
        // Implementación para seleccionar la opción de supermercado
    }

    public void selectHomeCareOption() {
        // Implementación para seleccionar la opción "Cuidado del Hogar"
    }

    public boolean hasCategoryOption(String category) {
        // Implementación para validar la presencia de una categoría
        return driver.findElement(By.linkText(category)).isDisplayed();
    }

    // Otros métodos relacionados con la página de supermercado
}
