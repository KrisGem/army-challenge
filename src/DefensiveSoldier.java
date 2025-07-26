public class DefensiveSoldier extends Soldier {
    public DefensiveSoldier(String name) {
    super(name, 10);
}

    @Override
    public void attack() {
        System.out.println(name + " performs a vigilant attack.");
    }

    @Override
    public void defend() {
        System.out.println(name + " uses Shield Wall!");
    }

}
