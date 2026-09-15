package com.tech.operators.oops;

import java.util.List;
import java.util.Vector;

public interface list {

    public static void main(String[] args) {

        List<Integer> v = new Vector<>();
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.set(2, 10); //updating
        v.remove(1);
        System.out.println(v.contains(10));//searching
        System.out.println(v);
       System.out.println("value of v:" + v.get(1));//retriveing


        System.out.println("This is an interface example value of v:" +v);
    }

}
