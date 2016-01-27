/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.forcollections;

/**
 *
 * @author jan
 */
class Animal2 {
}

class Dog2 extends Animal2 {
}

class Cat2 extends Animal2 {
}

public class ArrayGenerics {

    public static void main(String[] args) {
        Cat2[] catArray = {new Cat2(), new Cat2()};
        addAnimal(catArray);
// Cat[] tipindeki referans degiskenimiz Animal[] tipinde parametre alan
// metoda gonderebiliriz.
    }

    public static void addAnimal(Animal2[] animalArray) {
        animalArray[0] = new Dog2();
//bu metoda arguman olarak Cat[] tipinde bir arguman gonderdik.
// java.lang.ArrayStoreException: hatasi verecektir!
    }
}
