package com.company.animals;

import com.company.species.Herbivoren;

/**
 * @author Raymond Chang
 * This class acts like a Hippo
 */
public class Hippo extends Herbivoren {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo() {
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
