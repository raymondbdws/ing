package com.company;

/**
 * @author Raymond Chang
 * This is used to define an animal in the main class. The performTrick method will
 * * do nothing, unless when an animal has its own performTrick methods implemented.
 */
public abstract class Animal {
    public abstract void sayHello();

    public abstract String getName();

    public void performTrick() {
        //doing nothing, exept when an animal can do then this method will be overrided
    }
}
