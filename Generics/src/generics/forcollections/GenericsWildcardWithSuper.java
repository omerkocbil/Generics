/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.forcollections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jan
 */
class Animal4 {
}

class Dog4 extends Animal4 {
}

class Kangal4 extends Dog4 {
}

public class GenericsWildcardWithSuper {

    public static void main(String[] args) {
        List<Animal4> animalList = new ArrayList<Animal4>();
        List<Dog4> dogList = new ArrayList<Dog4>();
        List<Kangal4> kangalList = new ArrayList<Kangal4>();
        addAnimal(animalList);
        addAnimal(dogList);
// addAnimal(kangalList);
// derleme hatasi verir.
    }
// ? super Dog , buraya Dog ve super/ust sinif tipinde arguman kabul eder.

    public static void addAnimal(List<? super Dog4> dogList) {
        dogList.add(new Kangal4());
        dogList.add(new Dog4());
//Burada Dog veya alt sinif tipinde obje ekleyebiliriz.
// dogList.add(new Animal());
    }
}
