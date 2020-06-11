package Monsters.States;


import Monsters.Monster;

public class NormalMonsterState implements IMonsterState {

    Monster monster;

    public NormalMonsterState(Monster monster) {
        this.monster = monster;
    }


    @Override
    public void displayCurrentState() {
        String stateName = "Normal";
        System.out.println("Monster state: " + stateName);
    }

}
