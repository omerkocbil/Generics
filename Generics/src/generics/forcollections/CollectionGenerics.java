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
class Animal {

    public void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog eat");
    }
}

public class CollectionGenerics {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        List<Dog> dogList = new ArrayList<Dog>();
// List animalDogList = new ArrayList();
// Derleme hatasi verir! Referans degisken olarak tanimliysa ,
// new anahtar kelimesinden sonra olmalidir.
        genericsRules(animalList);
// genericsRules(dogList);
// dogList'i arguman olarak veremeyiz. Ilgili metot List tipinde
// bir parametre almaktadir.
// Dog IS-A Animal olsa da buraya List tipine bir degisken
// gonderemeyiz !
    }

    public static void genericsRules(List<Animal> myAnimals) {
        System.out.println("test");
    }

}
