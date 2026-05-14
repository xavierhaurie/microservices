package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Game {

    public void up() {
        System.out.println("Running Mario Game UP");
    }

    public void down() {
        System.out.println("Running Mario Game DOWN");
    }

    public void left() {
        System.out.println("Running Mario Game LEFT");
    }

    public void right() {
        System.out.println("Running Mario Game RIGHT");
    }
}
