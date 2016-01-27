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
public class GenericWithBoundType {

    public static <T extends Number> void boundedTypeMethod(T t) {
        System.out.println("T: " + t.getClass().getName());
    }

    public static void main(String[] args) {
        boundedTypeMethod(100);
        boundedTypeMethod(100.5);
        boundedTypeMethod(100.5f);
//boundedTypeMethod("compile error");
    }
}
