package org.digital.desingPatterns.chainOfnvocations;

public class ChainMain {

        public static void main(String[] args) {
            ChainOfInvocations obj = new ChainOfInvocations();


            obj.setValue(10).display().sayHello();//  --->  Chaining методов
        }

}
