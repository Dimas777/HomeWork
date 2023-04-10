package com.company;

import task2.Drum;
import task2.Guiter;
import task2.Instrument;
import task2.Tuba;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Reks",4);
        dog.mskeNoise();

        Cat cat = new Cat("Tomas", 8);
        cat.mskeNoise();

        Rat rat = new Rat("Jerry", 2);
        rat.mskeNoise();





        /////////////task2////////////////
        Instrument[] instruments = {new Guiter(4),
                new Guiter(7),
                new Drum(43.5),
                new Drum(77.2),
                new Tuba(30),
                new Tuba(40),
        };

        for (int i=0; i < instruments.length; i++ ){
            instruments[i].play();
        }
    }

}
