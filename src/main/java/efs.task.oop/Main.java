package efs.task.oop;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();
        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;


        //objectAkara.attack();
        //objectDecardCain.sayHello();

        List<Villager> villagers = new ArrayList<>();
        villagers.add(kashya);
        villagers.add(gheed);
        villagers.add(warriv);
        villagers.add(flawia);
        int i = 0;

        while(Monsters.getMonstersHealth()>0){
            for(Villager villager:villagers){
                if(villager.getHealth()>0){
                    System.out.println("Potwory posiadaja jeszcze " + Monsters.getMonstersHealth() +" punkty zycia");
                    System.out.println("Aktualnie walczacy osadnik to " + villager.getName());
                    if(Monsters.andariel.getHealth()>0){
                        villager.attack(Monsters.andariel);
                        if (Monsters.andariel.getHealth() > 0) {
                            Monsters.andariel.attack(villager);
                        }
                    }else if(Monsters.blacksmith.getHealth()>0){
                        villager.attack(Monsters.blacksmith);
                        if (Monsters.blacksmith.getHealth() > 0) {
                            Monsters.blacksmith.attack(villager);
                        }
                    }else{
                        break;
                    }

                }
            }
        }
        System.out.println("Obozowisko ocalone!");

        deckardCain = (ExtraordinaryVillager) objectDeckardCain;

        deckardCain.sayHello();

        akara = (ExtraordinaryVillager) objectAkara;

        akara.sayHello();


    }
}
