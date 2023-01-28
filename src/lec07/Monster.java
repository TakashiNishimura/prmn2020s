package lec07;

import java.util.List;
import java.util.Random;

public class Monster {

    private String name;
    private int hitPoint;
    private int attack;
    private int block;
    private int speed;
    private List<Move> moveList;

    public Monster(MONSTER_KIND monsterKind) {
        this(
                monsterKind.getName(),
                monsterKind.getHitPoint(),
                monsterKind.getAttack(),
                monsterKind.getBlock(),
                monsterKind.getSpeed(),
                monsterKind.getMoveList()
        );
    }

    public Monster(String name, int hitPoint, int attack, int block, int speed, List<Move> moveList) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
        this.moveList = moveList;
    }

    public void move(Monster monster) {
        var move = this.moveList.get(new Random().nextInt(moveList.size()));
        move.action(this, monster);

        System.out.println(this.getName() + " の " + move.getName() + " !");
        System.out.println(monster.getName() + " のHPは " + monster.getHitPoint() + " になった");
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    public int getBlock() {
        return block;
    }

    public int getSpeed() {
        return speed;
    }

}
