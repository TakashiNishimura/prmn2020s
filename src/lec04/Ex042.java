package lec04;

public class Ex042 {

    public static void main(String[] args) {
        ATM atm = new ATM();
        String name = "三浦一斗";
        String number = "12345";

        atm.existsAccount(name, number);

        atm.registerAccount(name, number);

        if (atm.existsAccount(name, number)) {
            atm.deposit(number, 1000);
            atm.withdraw(number, 2000);
            atm.withdraw(number, 500);
        }
    }

}
