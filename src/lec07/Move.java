package lec07;

public abstract class Move {

    private String name;

    public Move(String name) {
        this.name = name;
    }

    public abstract void action(Monster m0, Monster m1);

    public String getName() {
        return name;
    }
}
