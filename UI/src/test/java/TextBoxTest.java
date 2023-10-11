import org.digital.pages.BasePage;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    void fillUpTheFormTest(){
        driver.get("");
        textBoxPage.fillUpTheFullName("fsdgbds");
    }

}
