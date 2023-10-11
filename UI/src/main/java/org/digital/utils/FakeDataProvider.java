package org.digital.utils;

import com.github.javafaker.Faker;
import org.digital.models.Student;

public class FakeDataProvider {

    public static void main(String[] args) {
        System.out.println(generateFakeCurrentAddress());
    }

    static Faker faker = new Faker();

    public static String generateFakeFullName(){
        return faker.name().fullName();
    }

    public static String generateFakeFirstName(){
        return faker.name().firstName();
    }

    public static String generateFakeLastName(){
        return faker.name().lastName();
    }

    public static String generateFakePhoneNumber(){
        return faker.phoneNumber().phoneNumber();
    }



    public static String generateFakeEmail(){
        return faker.internet().emailAddress();
    }

    public static String generateFakeCurrentAddress(){
        return faker.address().fullAddress();
    }

    public static String generateFakePermanentAddress(){
        return faker.address().streetName() + " " + faker.address().streetAddress();
    }

    public Student createFakeStudent(){
        Student student = new Student();
//        student.setFirstName(faker.name().firstName());
        student.setFirstName(generateFakeFirstName());
//        student.setLastName(faker.name().lastName());
        student.setLastName(generateFakeLastName());
//        student.setEmail(faker.name().lastName());
//        student.setEmail(generateFakeEmail());
//        student.setPhoneNumber(generateFakePhoneNumber());
        student.setCurrentAddress(generateFakeCurrentAddress());
        return student;
    }

}
