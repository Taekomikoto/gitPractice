package org.digital.desingPatterns.Factory;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Едем на машине");
    }
}
