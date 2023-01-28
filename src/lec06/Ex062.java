package lec06;

import java.util.*;

public class Ex062 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();
        var randomIntList = Arrays.asList(
                random.nextInt(5) + 1,
                random.nextInt(5) + 1,
                random.nextInt(5) + 1,
                random.nextInt(5) + 1,
                random.nextInt(5) + 1
        );

        System.out.println("何番目のサイコロの値を確認しますか？");

        try {
            int index = scanner.nextInt();
            System.out.println(index + "番目のサイコロの目は" + randomIntList.get(index - 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。");
            e.printStackTrace();
        }

        System.out.println(randomIntList);
    }

}
