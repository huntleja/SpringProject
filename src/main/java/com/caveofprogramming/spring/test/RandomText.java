package com.caveofprogramming.spring.test;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by John on 2/20/2015.
 */

@Component
public class RandomText {

    private final static String[] texts = {"I'll be back", "Rock on", "There is a snake in my boot", null};

    public String getText() {
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }


}
