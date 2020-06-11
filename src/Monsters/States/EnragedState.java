package Monsters.States;


import Monsters.Monster;

public class EnragedState implements IMonsterState {
    Monster monster;

    public EnragedState(Monster monster) {
        this.monster = monster;
        System.out.println(monster.getMonsterName() + " is enraged");
        enrage();
    }

    private void enrage(){
        monster.setAtkDmg(monster.getAtkDmg() + 10);
    }


    @Override
    public void displayCurrentState() {
        String stateName = "Enraged.";
        System.out.println("Monster state: " + stateName);
    }
}
