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
class Animal3 {
}

class Dog3 extends Animal3 {
}

class Cat3 extends Animal3 {
}

public class GenericsWildcardWithExtends {

    public static void main(String[] args) {
        List<Animal3> animalList = new ArrayList<Animal3>();
        List<Dog3> dogList = new ArrayList<Dog3>();
        addAnimal(animalList);
        addAnimal(dogList);
    }

    public static void addAnimal(List<? extends Animal3> animalList) {
// <? extends Animal> olarak tanimli oldugu zaman yeni bir elaman
// ekleyemeyiz. sadece null ekleyebiliriz.
// animalList.add(new Animal());
// animalList.add(new Dog());
        animalList.add(null);
    }
}
