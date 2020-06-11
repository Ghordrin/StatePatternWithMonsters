package Monsters;

/**
 * A skeleton monster. Weakest monster of the 3.
 */
public class Skeleton extends Monster {
    public Skeleton(int hp, int maxHp, int atkDmg, String monsterName) {
        super(hp, maxHp, atkDmg, monsterName);
    }

    @Override
    public boolean canAttack() {
        return true;
    }
}
