package efs.task.oop;

public class Villager {
    protected String name;
    protected int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old");

    }
}
