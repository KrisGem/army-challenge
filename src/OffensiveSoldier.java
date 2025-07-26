public class OffensiveSoldier extends  Soldier{ public OffensiveSoldier(String name) {
    super(name, 30);
}

    @Override
    public void attack() {
        System.out.println(name + " attacks aggressively! Damage: " + damage);
    }

    @Override
    public void defend() {
        System.out.println(name + " tries to avoid the attack.");
    }
}
