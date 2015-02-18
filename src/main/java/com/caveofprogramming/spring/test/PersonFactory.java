package com.caveofprogramming.spring.test;

/**
 * Created by John on 2/18/2015.
 */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person.");
        return new Person(id, name);
    }
}
