public class People {
    protected int health = 0;   // лучше сразу занулять переменную

    void getDamage(int value) {
        this.health -= value;
    }

    void status() {
        System.out.println(this.getClass().getSimpleName() + ": " + health);
    }

    boolean isAlive() {
        return health > 0;
    }
}
