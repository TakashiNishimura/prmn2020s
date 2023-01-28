package lec06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex061 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("小数値を入力してください。");

        try {
            double number = scanner.nextDouble();
            System.out.println("入力した値:" + number);
        } catch (InputMismatchException e) {
            System.out.println("error!");
            e.printStackTrace();
        }
    }

}
