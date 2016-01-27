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
class UseTwo<T, X> {

    T one;
    X two;

    public T getOne() {
        return one;
    }

    public X getTwo() {
        return two;
    }

    public UseTwo(T one, X two) {
        this.one = one;
        this.two = two;
    }
}

public class GenericClass2 {

    public static void main(String[] args) {
        UseTwo<String, Integer> twos = new UseTwo<String, Integer>("Java", 2016);
        String one = twos.getOne();
        int two = twos.getTwo();
    }
}
