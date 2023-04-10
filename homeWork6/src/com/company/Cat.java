package com.company;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void mskeNoise() {
        System.out.println(getName() +" "+ getAge()+" мяу");
    }
}
