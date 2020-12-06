import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.pages.CartPage;
import org.fasttrack.steps.AdminSteps;
import org.fasttrack.steps.CartSteps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AdminTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private  AdminSteps adminSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private CartPage cartPage;
    @Test
    public void verifyNewAddedProduct(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("admin","parola11");
        loginSteps.clickLogin();
        adminSteps.goToDashboard();
        adminSteps.goToProductSection();
        adminSteps.addNewProduct();
        adminSteps.addName("tresure");
        adminSteps.clickPublishButton();
        adminSteps.goToDashboard();
        searchSteps.clickSearckLink();
        searchSteps.setSearchField("tresure");
        searchSteps.clickSearchButton();
        searchSteps.verifyProductIsOnTheSiteMessage("tresure");
    }

    @Test
    public void aproveComment(){
        loginSteps.goToLoginPage();
        loginSteps.enterLoginCredentials("admin","parola11");
        loginSteps.clickLogin();
        adminSteps.goToDashboard();
        adminSteps.goToComments("oliviu66@yahoo.ro");
        adminSteps.goToDashboard();
        cartPage.clickRecentCommentsLink();
        cartPage.findItemInList("oliviu66");
        adminSteps.goToDashboard();





    }
}
