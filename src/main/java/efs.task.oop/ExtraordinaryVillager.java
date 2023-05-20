package efs.task.oop;

import efs.task.oop.Villager;

public class ExtraordinaryVillager extends Villager {


    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private final String description;

        Skill(String description){
            this.description = description;
        }

        public String getDescription(){
            return this.description;
        }
    }

    private Skill skill;



    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old. " + skill.getDescription());
    }



}
