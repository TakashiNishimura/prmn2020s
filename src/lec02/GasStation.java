package lec02;

public class GasStation {

    public void refuel(Car car) {
        int fuel = car.getFuel();
        fuel += 20;
        car.setFuel(fuel);

        System.out.println("きゅうゆ");
    }

}
