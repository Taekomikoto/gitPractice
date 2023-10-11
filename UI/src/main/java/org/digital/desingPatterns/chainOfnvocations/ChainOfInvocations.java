package org.digital.desingPatterns.chainOfnvocations;

class ChainOfInvocations {
    private int value;

    public ChainOfInvocations setValue(int value) {
        this.value = value;
        return this;// ---> this нужен для продолжения chaining`a методов
    }

    public ChainOfInvocations display() {
        System.out.println("Value: " + value);
        return this;
    }

    public void sayHello(){
        System.out.println("Hello!" + value);
    }
}