package lec04;

public class Fighter {

    private int HP;
    private int strength;
    private String name;

    public Fighter(int HP, int strength, String name) {
        this.HP = HP;
        this.strength = strength;
        this.name = name;
    }

    public void attack(Fighter enemy) {
        enemy.setHP(enemy.getHP() - this.strength);

        System.out.println(this.name + " は " + enemy.getName() + " に " + this.strength + " ダメージ与えた");
        System.out.println(enemy.getName() + " の残りHP:" + enemy.getHP());
    }

    public boolean isAlive() {
        return this.HP >= 0;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

}
