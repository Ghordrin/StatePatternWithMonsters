package Monsters;

/**
 * a blob monster with high health but cannot attack according to interface
 */
public class Blob extends Monster {
    public Blob(int hp, int maxHp, int atkDmg, String monsterName) {
        super(hp, maxHp, atkDmg, monsterName);
    }

    @Override
    public boolean canAttack() {
        return false;
    }
}
