package com.company.animals;

import com.company.species.Carnivoren;

import java.util.Random;

/**
 * @author Raymond Chang
 * This class acts like a Tiger
 */
public class Tiger extends Carnivoren {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger() {
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
