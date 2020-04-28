package com.company.animals;

import com.company.species.Omnivoren;

import java.util.Random;

/**
 * @author Raymond Chang
 * This class acts like a fish
 */
public class Fish extends Omnivoren {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Fish() {
    }

    @Override
    public void sayHello() {
        helloText = "blub blub blub";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "blub blub need more food blub blub";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "blub blub thanks";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "help I am drowning";
        } else {
            trick = "Flying in the sky";
        }
        System.out.println(trick);
    }

    @Override
    public String getName() {
        return name;
    }
}
