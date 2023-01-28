package lec07;

import java.util.Random;

public class Ex072 {

    public static void main(String[] args) {
        var rnd = new Random();
        var m0 = new Monster(MONSTER_KIND.getMonsterKindFromOrder(rnd.nextInt(MONSTER_KIND.values().length)));
        var m1 = new Monster(MONSTER_KIND.getMonsterKindFromOrder(rnd.nextInt(MONSTER_KIND.values().length)));

        if (m0.getSpeed() < m1.getSpeed()) {
            var tmp = m0;
            m0 = m1;
            m1 = tmp;
        }

        while (true) {
            m0.move(m1);
            if (!m1.isAlive()) {
                System.out.println(m1.getName() + " は倒れた");
                break;
            }

            m1.move(m0);
            if (!m0.isAlive()) {
                System.out.println(m0.getName() + " は倒れた");
                break;
            }
        }
    }

}
