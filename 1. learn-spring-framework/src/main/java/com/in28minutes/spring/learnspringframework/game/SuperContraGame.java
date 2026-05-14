package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

public class SuperContraGame implements Game {

    public void up() {
        System.out.println("Super Contra Game UP");
    }

    public void down() {
        System.out.println("Super Contra Game DOWN");
    }

    public void left() {
        System.out.println("Super Contra Game LEFT");
    }

    public void right() {
        System.out.println("Super Contra Game RIGHT");
    }
}
