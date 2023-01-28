package lec02;

public class Engine {

    private int rpm;

    public Engine(int rpm) {
        this.rpm = rpm;
    }

    public void start() {
        System.out.println("スタート・ユア・エンジン！：" + rpm);
    }

}
