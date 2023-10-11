package org.digital.desingPatterns.Factory;
//import org.digital.desingPattern.Factory.Transport;

public class TransportFactory {
    public Transport createTransport(String transportType) {
        if (transportType == null) {
            return null;
        }
        if (transportType.equalsIgnoreCase("Автомобиль")) {
            return new Car();
        } else if (transportType.equalsIgnoreCase("Велосипед")) {
            return new Bicycle();
        }
        return null;
    }
}
