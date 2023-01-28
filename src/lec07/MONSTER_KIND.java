package lec07;

import java.util.ArrayList;
import java.util.List;

public enum MONSTER_KIND {

    TURTLE  ("Turtle"   , 55, 17, 16, 15, ACTION.RAZORLEAF),
    MONKEY  ("Monkey"   , 44, 14, 11, 31, ACTION.SCRATCH, ACTION.EMBER),
    PENGUIN ("Penguin"  , 53, 12, 13, 20, ACTION.PECK   , ACTION.BUBBLE),
    WILD    ("Wild"     , 50, 20, 10, 10, ACTION.SCRATCH, ACTION.PECK);

    private String name;
    private int hitPoint;
    private int attack;
    private int block;
    private int speed;
    private List<Move> moveList;

    MONSTER_KIND(String name, int hitPoint, int attack, int block, int speed, ACTION... actions) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
        this.moveList = new ArrayList<>();

        for (ACTION action : actions) {
            switch (action.type) {
                case 0:
                    this.moveList.add(new AttackMove(action.name(), action.param));
                    break;
                case 1:
                    this.moveList.add(new HealMove(action.name(), action.param));
                    break;
            }
        }
        this.moveList.add(new AttackMove(ACTION.TACKLE.name(), ACTION.TACKLE.param));
    }

    private enum ACTION {

        TACKLE      (0, 10),
        SCRATCH     (0, 10),
        PECK        (0, 15),
        RAZORLEAF   (0, 12),
        EMBER       (0, 10),
        BUBBLE      (0, 10),
        ;

        private int type;
        private int param;

        ACTION(int type, int param) {
            this.type = type;
            this.param = param;
        }
    }

    public static MONSTER_KIND getMonsterKindFromOrder(int order) {
        return MONSTER_KIND.values()[order];
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
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

    public List<Move> getMoveList() {
        return moveList;
    }

}