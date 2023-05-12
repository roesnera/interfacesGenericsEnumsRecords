package com.example.aaroe;

import com.example.aaroe.enums.*;
import com.example.aaroe.life.*;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Class-based arraylists
        ArrayList<Life> livingThings = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Plant> plants = new ArrayList<>();


        // Instances of all non-abstract classes
        Dog fido = new Dog("Fido", MyBreeds.TERRIER, MySpecies.CANINE);
        Cat kiki = new Cat("Kiki", MyBreeds.CALICO, MySpecies.FELINE);
        Flower rosey = new Flower("Rosey", MySpecies.ROSE);
        Tree red = new Tree("Ol Red", 10, MySpecies.REDOAK);

        // Section for adding all appropriate instances to their respective arraylists
        livingThings.add(fido);
        livingThings.add(kiki);
        livingThings.add(rosey);
        livingThings.add(red);

        animals.add(fido);
        animals.add(kiki);

        plants.add(rosey);
        plants.add(red);

        // Section for calling all available methods on instances in arraylists
        System.out.println("All my living things and their methods");
        for(Life thing: livingThings){
            System.out.println("Hi I'm "+thing.getName());
            System.out.println(thing.metabolizeEnergySource());
            System.out.println(thing.respire());
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("All my animals and their methods");
        for(Animal animal: animals){
            System.out.println(animal.makeSound());
            System.out.println(animal.respire());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("All my plants and their methods");
        for(Plant plant: plants){
            System.out.println(plant.respire());
        }
    }
}
