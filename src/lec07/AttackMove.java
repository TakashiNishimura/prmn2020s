package lec07;

public class AttackMove extends Move {

    private int power;

    public AttackMove(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void action(Monster m0, Monster m1) {
        m1.setHitPoint(m1.getHitPoint() - m0.getAttack() + power - m1.getBlock());
    }

}
