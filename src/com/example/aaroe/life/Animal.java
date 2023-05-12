package com.example.aaroe.life;

public class Animal extends Life {


    public Animal(String name) {
        super(name);
    }

    @Override
    public void respire(){
        System.out.println("Taking in oxygen, releasing CO2 . . .");
    }

    public void makeSound() {
        System.out.println("Animals make many different noises . . .");
    }
}
