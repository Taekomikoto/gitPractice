package org.digital.pages;

import org.digital.models.Student;

public class TestStudent {

    public void getInfoOFStudent(Student student){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getCurrentAddress());
        System.out.println(student.getEMail());
        System.out.println(student.getPhoneNUmber());

    }

}
