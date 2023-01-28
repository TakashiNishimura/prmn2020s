package lec03;

import java.util.Arrays;

public class Ex034 {

    public static void main(String[] args) {
        var vegetableList = Arrays.asList(
                new Vegetable("にんじん",117),
                new Vegetable("たまねぎ",120),
                new Vegetable("じゃがいも",154)
        );

        vegetableList.forEach(Vegetable::print);
    }

}
