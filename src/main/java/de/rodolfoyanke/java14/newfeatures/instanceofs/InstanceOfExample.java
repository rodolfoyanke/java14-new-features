package de.rodolfoyanke.java14.newfeatures.instanceofs;

public class InstanceOfExample {
    public static void main(String[] args) {
        var animal = getAnimal();

        //java 11
        if(animal instanceof Fish) {
            var fish = (Fish) animal;
            fish.swim();
        } else if(animal instanceof Dog) {
            var dog = (Dog) animal;
            dog.destroyCouch();
        }

        //java 14
        if(animal instanceof Fish fish) {
            fish.swim();
        } else if(animal instanceof Dog dog) {
            dog.destroyCouch();
        }
    }

    private static Animal getAnimal() {
        return new Fish();
    }
}
