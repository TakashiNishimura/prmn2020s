package lec02;

import java.util.ArrayList;

public class Ex023 {

    public static void main(String[] args) {
        var gasStation = new GasStation();
        var engine = new Engine(4000);
        var tireList = new ArrayList<Tire>();
        for (int i = 0; i < 4; i++) {
            Tire tire = new Tire(65);
            tireList.add(tire);
        }

        var car = new Car(tireList, engine);

        gasStation.refuel(car);

        car.startEngine();
        car.run();
    }

}
