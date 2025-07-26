import java.util.ArrayList;
import java.util.List;

public class Army { private final List<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier s) {
        soldiers.add(s);
    }

    public void attack() {
        System.out.println("=== Army Attacking ===");
        for (Soldier s : soldiers) {
            s.attack();
        }
    }

    public void defend() {
        System.out.println("=== Army Defending ===");
        for (Soldier s : soldiers) {
            s.defend();
        }
    }

    public void report() {
        System.out.println("=== Reporting Soldiers ===");
        for (Soldier s : soldiers) {
            s.report();
        }
    }

    public int totalDamage() {
        int total = 0;
        for (Soldier s : soldiers) total += s.getDamage();
        return total;
    }
}
