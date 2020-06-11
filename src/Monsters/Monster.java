package Monsters;

import Monsters.States.EnragedState;
import Monsters.States.IMonsterState;
import Monsters.States.NormalMonsterState;
import lombok.Data;

@Data
public abstract class Monster implements ICanAttack {

    private EnragedState enragedState;

    private int hp;
    private int maxHp;
    private int atkDmg;
    private String monsterName;
    private IMonsterState state;
    private boolean enraged = false;

    public Monster(int hp, int maxHp, int atkDmg, String monsterName) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.atkDmg = atkDmg;
        this.monsterName = monsterName;
        setState(new NormalMonsterState(this));
    }

    public void setState(IMonsterState state) {
        this.state = state;
    }

    public void takeDamage(int damage) {
        if (this.getHp() < this.getMaxHp() * 0.20 && !enraged) {
            this.setState(enragedState = new EnragedState(this));
            enraged = true;
        }
        this.hp -= damage;
    }


    public String toString() {
        return "Monster(hp=" + this.getHp() + ", maxHp=" + this.getMaxHp() + ", atkDmg=" + this.getAtkDmg() + ", monsterName=" + this.getMonsterName() + ", state=" + this.getState() + ")";
    }
}
