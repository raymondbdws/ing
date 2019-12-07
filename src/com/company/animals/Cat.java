package com.company.animals;

import com.company.species.Carnivoren;

/**
 * @author Raymond Chang
 * This class acts like a cat
 */
public class Cat extends Carnivoren {
    public String name;
    public String helloText;
    public String eatText;

    public Cat() {
    }

    @Override
    public void eatMeat() {
        eatText = "Smack Smack Smack";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        helloText = "Miauw, Make that the cat wise.";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
