package lec02;

import java.util.List;

public class Car {

    private int fuel;
    private List<Tire> tireList;
    private Engine engine;

    public Car() {
        this.fuel = 0;
    }

    public Car(List<Tire> tireList, Engine engine) {
        this.fuel = 0;
        this.tireList = tireList;
        this.engine = engine;
    }

    public void run() {
        String massage;

        if (this.fuel <= 0) {
            massage = "はしれぬ";
        } else {
            this.fuel -= 1;
            massage = "はしった";
        }

        System.out.println(massage);
    }

    public void checkFuel() {
        System.out.println("なうfuel：" + this.fuel);
    }

    public void startEngine() {
        this.engine.start();
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

}
