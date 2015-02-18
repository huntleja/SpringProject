package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by John on 2/17/2015.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        Person person = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");

        person.setTaxId(666);

        System.out.println(person2);

        ((ClassPathXmlApplicationContext) context).close();

    }
}
