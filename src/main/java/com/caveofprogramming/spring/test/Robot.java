package com.caveofprogramming.spring.test;

/**
 * Created by John on 2/20/2015.
 */
public class Robot {

    private String id = "Default robot";
    private String speech = "hello";

    public void setId(String id) {
        this.id = id;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public void speak() {
        System.out.println(id + " : " + speech);
    }
}
