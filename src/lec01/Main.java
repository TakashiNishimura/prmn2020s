package lec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {
        final int MAX = 4;
        int head = random(), tail = random(), size = random();
        int[] array = {0, 0, 0, 0};

        System.out.print("[");
        for (int i = 0; i < MAX; i++) {
            //有効でない値を「.」に変換
            if ((i < head && tail <= i) ||
                (tail > head && (tail <= i || i < head) ||
                 (size == MAX))) {
                System.out.printf("%d ", array[i]);
            } else {
                System.out.print(". ");
            }
        }

//        List<String> stList = new ArrayList<>();
//        addList(stList);
//        addList(stList);
//
//        System.out.println(stList);

//        System.out.println("Hello World!");
//
//        int studentNumber = 2181930;
//        System.out.println("studentNumber　" + studentNumber + "　takashi");
//
//        String animals = "cat";
//
//        if (animals.equals("dog")) {
//            animals += " is cool.";
//        } else if (animals.equals("cat")) {
//            animals += " is cute.";
//        } else {
//            animals = "I don't know " + animals + " .";
//        }
//
//        System.out.println(animals);
//
//        var array = new int[100];
//        setAll(array, i -> i + 1);
//
//        int sum = stream(array)
//                .filter(i -> (i % 2) == 0)
//                .sum();
//
//        System.out.println(sum);
    }

    public static int random () {
        return new Random().nextInt(4);
    }

    public static void addList(List<String> stList) {
        stList.add("a");
    }

}
