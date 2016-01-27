/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.basic;

/**
 *
 * @author jan
 */
public class GenericMethod {

//Donus tipimizde E olacaksa void keyword unu kaldırmak yeter
    public static <E> void genericMethod(E[] myArray) {
        for (E element : myArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("Array integerArray contains:");
        genericMethod(intArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        genericMethod(doubleArray); // pass a Double array
        System.out.println("\nArray characterArray contains:");
        genericMethod(charArray); // pass a Character array
    }
}
