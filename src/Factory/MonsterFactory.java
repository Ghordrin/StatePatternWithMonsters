package Factory;

import Monsters.Blob;
import Monsters.Goblin;
import Monsters.Monster;
import Monsters.Skeleton;

public class MonsterFactory {

    public Monster getMonster(int type) {
        switch (type) {
            case 1:
                return new Goblin(100, 100, 10, "Goblin");
            case 2:
                return new Blob(300, 300, 0, "Blob");
            case 3:
                return new Skeleton(50, 50, 3, "Skeleton");
            default:
                return null;
        }
    }
}
