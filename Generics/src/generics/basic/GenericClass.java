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
class MyGenericClass<T> {
    // T , type paremetresi
//instance degisken T tipi olabilir.

    T genericReference;
//Metot donus tipi T olabilir.

    public T getGenericReference() {
        return genericReference;
    }

    public MyGenericClass(T genericReference) {
        this.genericReference = genericReference;
    }
}

public class GenericClass {

    public static void main(String[] args) {
        MyGenericClass<Integer> intOb = new MyGenericClass<Integer>(100);
        MyGenericClass<String> strOb = new MyGenericClass<String>("Test");
        MyGenericClass raw = new MyGenericClass(10.5);
        Integer intValue = intOb.getGenericReference();
        String strValue = strOb.getGenericReference();
        double doubleValue = (double) raw.getGenericReference();
        System.out.println("int :" + intValue);
        System.out.println("String :" + strValue);
        System.out.println("double :" + doubleValue);
    }
}
