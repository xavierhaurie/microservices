package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

public class PacManGame implements Game {

    public void up() {
        System.out.println("Running PacMan Game UP");
    }

    public void down() {
        System.out.println("Running PacMan Game DOWN");
    }

    public void left() {
        System.out.println("Running PacMan Game LEFT");
    }

    public void right() {
        System.out.println("Running PacMan Game RIGHT");
    }
}
