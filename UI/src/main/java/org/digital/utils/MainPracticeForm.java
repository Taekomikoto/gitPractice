package org.digital.utils;
import org.digital.driver.Driver;
import org.digital.models.Student;
import org.digital.pages.PracticeFormPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class MainPracticeForm {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student= new Student();
        student.setFirstName("Jyldyz");
        student.setLastName("Jeenbaeva");
//        student.setEMail("Jilduz@gmail.com");
        student.setCurrentAddress("Lenina 268");
//        student.setPhoneNUmber("9965553570");
//        PracticeFormPages practiceFormPages= new PracticeFormPages();
//        practiceFormPages.fillUpTheForm(student).test(student);






//        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
//                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
//                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
//                .fillUpTheUserNumber(fakeDataProvider.generationPhoneNUmber())
//                .fillUpTheCurrentAddress(fakeDataProvider.generationFakeCurrentAddress())
//                .clickGender()
//                .clickHobbies()
//                .selectState()
//                .selectSubject()
//                .selectSubject()
//                .selectSubject()
//                .setUploadPicture()
//                .selectSubmitBtn();
        Thread.sleep(5000);
//        Driver.closeDriver();

    }
}