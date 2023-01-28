package lec02;

public class Ex022 {

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.checkFuel();

        new GasStation().refuel(car);
        car.checkFuel();

        car.run();
        car.checkFuel();
    }

}
