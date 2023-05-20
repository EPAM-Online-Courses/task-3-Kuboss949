package efs.task.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Villager> vilList = new ArrayList<>();
        vilList.add(new Villager("Kashya", 30));
        vilList.add(new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER));
        vilList.add(new Villager("Gheed", 50));
        vilList.add(new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY));
        vilList.add(new Villager("Warriv", 35));
        vilList.add(new Villager("Flawia", 25));


        vilList.forEach((v) -> v.sayHello());
    }
}
