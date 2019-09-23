package com.gp.model;

import java.util.Random;

public class RandomNumber {
    public Integer getNumber(){
        Random random = new Random();
        Integer number = random.nextInt(8);
        return number;
    }
}
