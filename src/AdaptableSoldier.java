public class AdaptableSoldier extends Soldier {
    public AdaptableSoldier(String name) {
        super(name, 20);
    }

    @Override
    public void attack() {
        System.out.println(name + " switches to offensive mode!");
    }

    @Override
    public void defend() {
        System.out.println(name + " switches to defensive mode!");
    }

}
