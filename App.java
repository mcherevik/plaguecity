import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<People> cityPeople = new ArrayList<>(136);
        cityPeople.add(new King());
        for (int i = 0; i < 10; i++) {
            cityPeople.add(new Noble());
        }
        for (int i = 0; i < 25; i++) {
            cityPeople.add(new Knight());
        }
        for (int i = 0; i < 100; i++) {
            cityPeople.add(new Peasant());
        }

        for (int i = 0; i < 5; i++) {   // days
            System.out.println("Day of plague: " + (i + 1));
            for (People p : cityPeople) {
                if (p.isAlive()) {
                    p.getDamage((int) (Math.random() * 30));
                    p.status();
                }
                else {
                    System.out.println("Dead");
                    p.status();
                }
            }
        }

        int aliveKingCounter = 0;
        int aliveNoblesCounter = 0;
        int aliveKnightsCounter = 0;
        int alivePeasantsCounter = 0;
        for (People p : cityPeople) {
            if (p.health > 0) {
                if (p instanceof King) {
                    aliveKingCounter++;
                }
                else if (p instanceof Noble) {
                    aliveNoblesCounter++;
                }
                else if (p instanceof Knight) {
                    aliveKnightsCounter++;
                }
                else if (p instanceof Peasant) {
                    alivePeasantsCounter++;
                }
            }
        }
        System.out.println("Number of kings alive: " + aliveKingCounter);
        System.out.println("Number of nobles alive: " + aliveNoblesCounter);
        System.out.println("Number of knights alive: " + aliveKnightsCounter);
        System.out.println("Number of peasants alive: " + alivePeasantsCounter);
    }
}
