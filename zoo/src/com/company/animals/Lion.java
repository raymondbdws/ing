package com.company.animals;

import com.company.species.Carnivoren;

/**
 * @author Raymond Chang
 * This class acts like a Lion
 */
public class Lion extends Carnivoren {
    public String name;
    public String helloText;
    public String eatText;

    public Lion() {
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
