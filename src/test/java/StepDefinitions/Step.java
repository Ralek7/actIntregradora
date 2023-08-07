package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Step{
    private WebDriver driver;
    private HomePage homePage;
    private JobOpportunitiesPage jobOpportunitiesPage;
    private ProductPage productPage;
    private SupermarketPage supermarketPage;

    // Configuración y limpieza del driver

    @Given("El usuario está en la página de Mercado Libre")
    public void navigateToMercadoLibre() {
        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.visit("https://www.mercadolibre.com.mx/");
    }

    @When("Selecciona la opción {string}")
    public void selectOption(String option) {
        homePage.selectOption(option);
    }

    @When("Selecciona {string}")
    public void selectSeeOpportunities(String subOption) {
        jobOpportunitiesPage.selectSeeOpportunities(subOption);
    }

    @When("Busca el producto {string}")
    public void searchProduct(String productName) {
        productPage.searchProduct(productName);
    }

    @When("Selecciona ofertas")
    public void selectOffers() {
        homePage.selectOffers();
    }

    @When("Selecciona ofertas relámpago")
    public void selectFlashDeals() {
        homePage.selectFlashDeals();
    }

    @When("Selecciona ofertas top living")
    public void selectTopLivingDeals() {
        homePage.selectTopLivingDeals();
    }

    @When("Selecciona ofertas cinsa")
    public void selectCinsaDeals() {
        homePage.selectCinsaDeals();
    }

    @When("Selecciona opción Supermercado")
    public void selectSupermarketOption() {
        supermarketPage.selectSupermarketOption();
    }

    @When("Selecciona opción Cuidado del Hogar")
    public void selectHomeCareOption() {
        supermarketPage.selectHomeCareOption();
    }

    @Then("Valida la opción {string}")
    public void validateOption(String option) {
        // Implementación
    }

    @Then("Valida el filtro de precio")
    public void validatePriceFilter() {
        // Implementación
    }

    @Given("Usuario entra a mercado libre")
    public void usuario_entra_a_mercado_libre() {
        // Write code here that turns the phrase above into concrete actions
        oLaborales = new OfertasLabPage(driver);
        driver = oLaborales.chromeDriverConnection();
        oLaborales.visit("https://www.mercadolibre.com.mx/");
    }

    @When("click en trabaja con nosotros")
    public void click_en_trabaja_con_nosotros() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        oLaborales.clickTrabaja();
    }
}
