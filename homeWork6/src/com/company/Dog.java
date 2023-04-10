package com.company;

public class Dog extends Animal {

    public  Dog (String name, int age){
        super(name,age);
    }

    @Override
    public void mskeNoise() {
        System.out.println(getName() +" "+ getAge()+" Гав");
    }
}
