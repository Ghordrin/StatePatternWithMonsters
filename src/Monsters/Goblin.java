package Monsters;

/**
 * A goblin monster. Can attack and strongest of the 3 in terms of atk damage.
 */
public class Goblin extends Monster {

    public Goblin(int hp, int maxHp, int atkDmg, String monsterName) {
        super(hp, maxHp, atkDmg, monsterName);
    }

    @Override
    public boolean canAttack() {
        return true;
    }
}
