package org.digital.desingPatterns.Factory;

public class MainFactory {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport car = factory.createTransport("Автомобиль");
        car.move();

        Transport Bicycle = factory.createTransport("Велосипед");
        Bicycle.move();
    }
}
