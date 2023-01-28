package lec03;

import java.util.Scanner;

public class Ex033 {

    public static void main(String[] args) {
        var scanner0 = new Scanner(System.in);

        System.out.print("一つめ");
        String str0 = scanner0.nextLine();

        System.out.print("二つめ");
        String str1 = scanner0.nextLine();

        var scanner1 = new Scanner(str0);
        var scanner2 = new Scanner(str1);

        int a = scanner1.nextInt();
        int b = scanner2.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
    }

}
