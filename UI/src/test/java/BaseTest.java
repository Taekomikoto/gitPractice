import org.digital.driver.Driver;
import org.digital.models.Student;
import org.digital.pages.PracticeFormPage;
import org.digital.pages.TextBoxPage;
import org.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Stack;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormPage practiceFormPages;
    public FakeDataProvider fakeDataProvider;


    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver= Driver.getDriver();
        textBoxPage= new TextBoxPage();
        practiceFormPages= new PracticeFormPage();
        fakeDataProvider= new FakeDataProvider();

    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }

}
