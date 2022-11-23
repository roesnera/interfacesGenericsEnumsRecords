package com.example.aaroe;

import com.example.aaroe.enums.*;
import com.example.aaroe.interfaces.*;
import com.example.aaroe.life.*;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Class-based arraylists
        ArrayList<Life> livingThings = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Plant> plants = new ArrayList<>();

        // Interface-based arraylists
        ArrayList<Breed> catsNDogs = new ArrayList<>();
        ArrayList<Species> species = new ArrayList<>();


        // Instances of all non-abstract classes
        Animal firstAnimal = new Animal("Original Animal");
        Plant oldPlant = new Plant("Real old plant");
        Fungus spaceShroom = new Fungus("Mushroom from space!");
        Dog fido = new Dog("Fido", MyBreeds.TERRIER, MySpecies.CANINE);
        Cat kiki = new Cat("Kiki", MyBreeds.CALICO, MySpecies.FELINE);
        Flower rosey = new Flower("Rosey", MySpecies.ROSE);
        Tree red = new Tree("Ol Red", 10, MySpecies.REDOAK);

        // Section for adding all appropriate instances to their respective arraylists
        livingThings.add(firstAnimal);
        livingThings.add(oldPlant);
        livingThings.add(spaceShroom);
        livingThings.add(fido);
        livingThings.add(kiki);
        livingThings.add(rosey);
        livingThings.add(red);

        animals.add(firstAnimal);
        animals.add(fido);
        animals.add(kiki);

        plants.add(oldPlant);
        plants.add(rosey);
        plants.add(red);

        catsNDogs.add(fido);
        catsNDogs.add(kiki);

        species.add(red);
        species.add(rosey);
        species.add(fido);
        species.add(kiki);

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

        System.out.println("-----------------------------------------------------------");
        System.out.println("All classes that implement the breed interface");
        for(Breed breed: catsNDogs){
            System.out.println(breed.shareBreed());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("All classes that implement the species interface");
        for(Species species1: species){
            System.out.println(species1.shareSpecies());
            System.out.println(species1.shareLifeCycle());
        }
    }
}
