public abstract class Soldier implements Commands{
    protected String name;
    protected int damage;

    public Soldier(String name, int damage) {
        this.name = name;
        this.damage = damage;

    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void report() {
        System.out.println("Reporting: " + name);
    }}
