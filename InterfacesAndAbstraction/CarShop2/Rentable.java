package InterfacesAndAbstraction.CarShop2;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
