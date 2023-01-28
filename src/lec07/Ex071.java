package lec07;

import java.util.Arrays;

public class Ex071 {

    public static void main(String[] args) {
        var mnsList = Arrays.asList(
                new Monster(MONSTER_KIND.TURTLE),
                new Monster(MONSTER_KIND.MONKEY),
                new Monster(MONSTER_KIND.PENGUIN)
        );

        mnsList.stream()
                .map(Monster::getName)
                .forEach(System.out::println);
    }

}

