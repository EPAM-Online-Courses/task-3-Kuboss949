package efs.task.oop;

public class Villager implements Fighter {
    protected String name;
    protected int age;
    protected int health;


    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }
    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old");
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }


    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int)(100-age*0.5)/10);
    }

    @Override
    public void takeHit(int damage) {
        health-=damage;
    }
}
