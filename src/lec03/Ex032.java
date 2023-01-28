package lec03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex032 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("何行？");
        int times = scanner.nextInt();
        scanner.nextLine();

        var strList = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            System.out.print("入力：");
            strList.add(scanner.nextLine());
        }

        strList.forEach(System.out::println);
    }

}
