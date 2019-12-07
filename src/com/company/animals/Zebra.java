package com.company.animals;

import com.company.species.Herbivoren;

/**
 * @author Raymond Chang
 * This class acts like a Zebra
 */
public class Zebra extends Herbivoren {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra() {
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
