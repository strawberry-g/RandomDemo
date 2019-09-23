package com.gp;

import org.junit.Test;

import java.util.Random;

public class Text {
    @Test
    public void test(){
        Random random = new Random();
        Integer num = random.nextInt(8);
        System.out.println(num);
    }
}
