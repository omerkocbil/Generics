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
class Car5 {
    
}

public class GenericsWildcard {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<String>();
        List<Car5> carList = new ArrayList<Car5>();
        List<Object> objectList = new ArrayList<Object>();
        wildcard(integerList);
        wildcard(stringList);
        wildcard(carList);
        wildcard(objectList);
    }
// Sadece ? wildcard'i kullandigimizda buraya herhangi bir tipte tip kabul
// edilebilir anlamina gelmektedir.

    public static void wildcard(List<?> myList) {
        System.out.println("wildcard ?");
// myList.add("Compile Error");
// ? tek basina kullanildiginda burada eleman eklenemez.
// sadece null eklenir
        myList.add(null);
    }
}
