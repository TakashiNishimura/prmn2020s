package lec04;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private List<Account> accounts;

    public ATM() {
        this.accounts = new ArrayList<>();
    }

    public void registerAccount(String name, String number) {
        Account account = new Account(name, number);
        this.accounts.add(account);

        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    public boolean existsAccount(String name, String number) {
        boolean exists = accounts.stream()
                .anyMatch(account -> account.getName().equals(name) && account.getNumber().equals(number));

        String mes = "名前:" + name + " 口座番号:" + number + " は存在";
        mes += exists ? "します。" : "しません。";

        System.out.println(mes);

        return exists;
    }

    public void deposit(String number, long money) {
        try {
            Account account = this.existsAccountNumber(number);
            account.setBalance(account.getBalance() + money);

            System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");

        } catch (NullPointerException e) {
            System.out.println("口座番号:" + number + " は存在しませんでした。");
        }
    }

    public void withdraw(String number, long money) {
        Account account = this.existsAccountNumber(number);

        if (account == null) {
            System.out.println("口座番号:" + number + " は存在しませんでした。");
            return;
        }

        long balance = account.getBalance();
        long newBalance = balance - money;
        String mes = "口座番号:" + number + " から " + money + " 円引き出";

        if (newBalance < 0) {
            mes += "せませんでした。残高:" + balance + "円です。";
        } else {
            account.setBalance(newBalance);

            mes += "しました。残高:" + newBalance + "円です。";
        }

        System.out.println(mes);
    }

    private Account existsAccountNumber(String number) {
        return accounts.stream()
                .filter(account -> account.getNumber().equals(number))
                .findFirst()
                .orElse(null);
    }

}
