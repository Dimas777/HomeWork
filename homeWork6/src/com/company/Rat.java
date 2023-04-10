package com.company;


public class Rat extends  Animal {
    public Rat(String name, int age) {
        super(name, age);
    }

    @Override
    public void mskeNoise() {
        System.out.println(getName() +" "+ getAge()+" писк");
    }
}
