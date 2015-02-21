package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

        List<Offer> offers = offersDao.getOffers();

        for (Offer offer : offers) {
            System.out.println(offer);
        }



        ((ClassPathXmlApplicationContext) context).close();
    }

}
