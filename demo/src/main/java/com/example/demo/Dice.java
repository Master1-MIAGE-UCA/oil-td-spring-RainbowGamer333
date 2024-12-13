package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice {
    public int roll() {
        return new Random().nextInt(1, 6);
    }
}
