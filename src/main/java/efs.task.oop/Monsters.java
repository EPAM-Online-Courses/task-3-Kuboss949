package efs.task.oop;

public class Monsters {
    static final Monster andariel = new Monster(10,70){
        @Override
        public void takeHit(int damage){
            super.takeHit(damage);
            monstersHealth = this.getHealth()>0 ? monstersHealth-damage: monstersHealth-(damage+this.getHealth());
        }
    };

    static final Monster blacksmith = new Monster(100,25){
        @Override
        public void takeHit(int damage){
            super.takeHit(damage+5);
            monstersHealth = this.getHealth()>0 ? monstersHealth-(damage+5): monstersHealth-(damage+5+this.getHealth());
        }
    };

    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }
}
