package org.digital.desingPatterns.Factory;

public class Bicycle implements Transport{
    @Override
    public void move() {
        System.out.println("Едем на велосипеде");
    }
}
