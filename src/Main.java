public class Main {
    public static void main(String[] args) {
        Army myArmy = new Army();
        myArmy.addSoldier(new OffensiveSoldier("Knight Oscar"));
        myArmy.addSoldier(new OffensiveSoldier("Knight Alpha"));
        myArmy.addSoldier(new DefensiveSoldier("Guard 322"));
        myArmy.addSoldier(new DefensiveSoldier("Guard 351"));
        myArmy.addSoldier(new AdaptableSoldier("Scout Ranger 1"));
        myArmy.addSoldier(new AdaptableSoldier("Scout Ranger 2"));

        Army enemyArmy = new Army();
        enemyArmy.addSoldier(new OffensiveSoldier("Enemy Raider 103"));
        enemyArmy.addSoldier(new DefensiveSoldier("Enemy Tank 102"));
        enemyArmy.addSoldier(new AdaptableSoldier("Enemy Shooter 101"));
        enemyArmy.addSoldier(new AdaptableSoldier("Enemy Shooter 102"));


        myArmy.report();
        myArmy.attack();
        enemyArmy.defend();


        int myArmyPower = myArmy.totalDamage();
        int enemyPower = enemyArmy.totalDamage();

        System.out.println("\n=== Battle Result ===");
        if (myArmyPower > enemyPower) {
            System.out.println("Our army has defeated the enemy!");
        } else if (enemyPower > myArmyPower) {
            System.out.println("The enemy army overpowered us...");
        } else {
            System.out.println("It's a draw. Both armies retreat.");
        }
    }


}