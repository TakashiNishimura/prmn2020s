package lec02;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        String mes;

        try {
            mes = message();
            System.out.println(mes + " : " + name + age + "歳");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private String message() {

        if (age <= 18) {
            return "生徒";
        } else if (age <= 22) {
            return "学生";
        } else {
            return null;
        }

    }

}
