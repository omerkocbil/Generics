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
class Car6 {
    
}

public class GenericsWildcardWithObject {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<String>();
        List<Car6> carList = new ArrayList<Car6>();
        List<Object> objectList = new ArrayList<Object>();
// wildcard(integerList);
// wildcard(stringList);
// wildcard(carList);
        wildcard(objectList);
    }

    public static void wildcard(List<Object> myList) {
        System.out.println("Object");
        myList.add(10);
        myList.add("test");
        myList.add(new Car6());
    }
}
