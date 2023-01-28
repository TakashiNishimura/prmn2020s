package lec07;

public class HealMove extends Move {

    private int resilience;

    public HealMove(String name, int resilience) {
        super(name);
        this.resilience = resilience;
    }

    @Override
    public void action(Monster m0, Monster m1) {
        m1.setHitPoint(m1.getHitPoint() + resilience);
    }

}
